package ryc002;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveFileDemo {
	public static void main(String[] args) {
		saveFile("C:\\exp\\file1.dat");
	}

	static void saveFile(String path) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (s.hasNextLine()) {
			String line = s.nextLine();
			if (line.equals("exit"))
				break;
			sb.append(line).append("");
		}
		FileWriter fw = null;
		try {
			File file = new File(path);
			if (!file.exists())
				file.createNewFile();
			fw = new FileWriter(file);
			fw.write(sb.toString());
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				fw = null;
			} catch (IOException e) {
			}
		}
	}
}
