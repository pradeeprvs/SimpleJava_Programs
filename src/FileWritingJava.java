import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingJava {

	private static final String FILENAME = "C:\\Users\\Pradeep R V S\\Desktop\\TextFileNew.txt";
	

	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter(FILENAME);
		try (BufferedWriter bw = new BufferedWriter(writer)) {

			String content = "This is the content to write into file\n";
				bw.write(content);

			// no need to close it.
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
