import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextFileReading {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String File="C:\\Users\\Pradeep R V S\\Desktop\\TextFile.txt";
		FileReader readFile=new FileReader(File);
		BufferedReader br= new BufferedReader(readFile);
		StringBuilder sb=new StringBuilder();
		String line;
		int lineCount=0;
		int noOfWords=0;
		while(br.readLine()!=null) {
			line=br.readLine();
			lineCount++;
//			System.out.println("Line Read Was : "+line);
			String[] WordCount= line.split(" ");
			int wordsInLine=WordCount.length;
//			System.out.println("Words in this line are : "+ (wordsInLine-1));
//			System.out.println("Words I Read were : ");
//			for(int i=0;i<wordsInLine;i++) {
//				System.out.println(WordCount[i]);
//			}
			for (int i=0;i<WordCount.length-1;i++) {
				String word= WordCount[i];
				String toUppercase= Character.toUpperCase(word.charAt(0)) + word.substring(1);
				sb.append(toUppercase);
				sb.append(" ");
			}
			System.out.println(sb);
			noOfWords=WordCount.length;
			noOfWords++;
		}
		//System.out.println("The No.of Lines I read were : "+lineCount+ " and The NoOf words are : "+noOfWords);
	}

}
