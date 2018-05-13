package youranxueER;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatedErmLine {

	public static void main(String[] args) throws IOException {

		String ermFile = "C:/Users/xjwan/git/er/youranxueER/src/youranxueDB.erm";

		// String ermFile =
		// "C:/Users/xjwan/git/er/youranxueER/src/youranxueER/test";

		BufferedReader reader = new BufferedReader(new FileReader(ermFile));
		List<String> lines = new ArrayList<>();

		String lineBefore = reader.readLine();
		String line;

		while ((line = reader.readLine()) != null) {
			if (line.equals(lineBefore)) {

			} else {
				lines.add(line);
				lineBefore = line;
			}
		}
		reader.close();

		BufferedWriter writer = new BufferedWriter(new FileWriter(ermFile));
		for (String unique : lines) {
			writer.write(unique);
			writer.newLine();
		}
		writer.close();
		
	System.out.println("重复行删除完成！");
	}

}
