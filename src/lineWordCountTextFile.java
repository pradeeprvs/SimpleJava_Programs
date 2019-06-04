import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lineWordCountTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileloc= "C:\\Users\\pravinutala\\Desktop\\temp\\Test.txt";
		File textfile = new File(fileloc);
		
		int lineCount=0,wordCount=0;
		String line=" ";
		BufferedReader br=new BufferedReader(new FileReader(textfile));
		while((line =br.readLine())!= null) {
			   lineCount++;
			//System.out.println(line);
			@SuppressWarnings("null")
			String[] words =line.split(" ");
			   wordCount=wordCount+ words.length;
		}	
		 System.out.println("Number of lines is : " + lineCount);
         System.out.println("Number of words is : " + wordCount);
	}

}
