package com.youranxue.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.AppConfig;

@RestController
@RequestMapping("/image")
public class ImageController {

	private static final String NO_IMAGE = "noImage.jpg";

	@Autowired
	private AppConfig config;

	@RequestMapping(value = "/imageDisplay/{imgFile:.*}", method = RequestMethod.GET)
	public @ResponseBody byte[] showImage(@PathVariable String imgFile, HttpServletResponse response,
			HttpServletRequest request) {

		return show(imgFile, "", response, request);
	}

	@RequestMapping(value = "/imageDisplay/{outerFolder}/{imgFile:.*}", method = RequestMethod.GET)
	public @ResponseBody byte[] showOuterImage(@PathVariable String imgFile, @PathVariable String outerFolder,
			HttpServletResponse response, HttpServletRequest request) {

		return show(imgFile, outerFolder, response, request);
	}

	@RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
	public @ResponseBody byte[] showNoImage(HttpServletResponse response, HttpServletRequest request) {

		return show(NO_IMAGE, "", response, request);

	}

	private byte[] show(String imgFile, String outerFolder, HttpServletResponse response, HttpServletRequest request) {
		String imgSubFolder = "".equals(outerFolder) ? "resources/images/" : outerFolder;
		String imgRootPath = config.getImageRoot().concat(imgSubFolder).concat("/");

		if (StringUtils.isEmpty(imgFile)) {
			imgFile = imgRootPath.concat(NO_IMAGE);
		}

		imgFile = imgFile.replace("_", "/");

		File file = new File(imgRootPath.concat(imgFile));
		if (!file.exists()) {
			file = new File(imgRootPath.concat(NO_IMAGE));
		}

		try {
			byte[] img = FileUtils.readFileToByteArray(file);

			if (!isSvgFile(imgFile)) {
				InputStream is = new ByteArrayInputStream(img);
				response.setContentType("image/jpeg;image/jpg;image/png;image/gif;image/svg");
				String attachment = "inline; filename=" + file.getName();
				response.setHeader("content-Disposition", attachment);
				IOUtils.copy(is, response.getOutputStream());
				response.flushBuffer();
				is.close();
			} else {
				return img;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

		return null;
	}

	private boolean isSvgFile(String fileName) {
		if (StringUtils.isEmpty(fileName)) {
			return false;
		}

		String ext = FilenameUtils.getExtension(fileName);
		if (StringUtils.isEmpty(ext)) {
			return false;
		}

		return ext.toLowerCase().equals("svg") ? true : false;
	}

}
