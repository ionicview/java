package com.youranxue.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youranxue.domain.security.User;
import com.youranxue.vo.NewCourseVO;

@RestController
public class TestController {

	@GetMapping("/public1")
	@CrossOrigin
	public String publicService() {
		return "This message is public";
	}

	@PostMapping("/public")
	@CrossOrigin
	public NewCourseVO publicTestService(@RequestBody NewCourseVO newTask) {
		System.out.println(newTask.getClassName());
		return newTask;
	}

	@GetMapping("/secret")
	@CrossOrigin
	public User secretService() {

		User user = new User();
		user.setLastName("admin.last.test");
		user.setUsername("admin");
		user.setFirstName("admin.first");
		return user;
	}

}
