import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWritingJava {

	private static final String FILENAME = "C:\\Users\\pravinutala\\Desktop\\temp\\tempFile.txt";
	

	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter(new File(FILENAME));
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
