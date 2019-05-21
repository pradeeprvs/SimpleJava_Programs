import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practiceProgram_Rough {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String FileLoc="C://Users//Pradeep R V S//Desktop//TextFile.txt";
		String Line="";
		String[] Words;
		
		int[] str= new int[5];
		str[1]= 1;
		
		List<Object> test=new ArrayList<>(Arrays.asList(str));
		
		int LineCount=0,WordCount=0;
		
		try(BufferedReader br=new BufferedReader(new FileReader(FileLoc))){

			while((Line =br.readLine())!= null){
				LineCount++;
			Words=Line.split(" ");
			WordCount=Words.length;
			}
			System.out.println("The Number of Lines in the given File is :"+LineCount +" and The number of Words are :"+WordCount);
			
		}
	}

}
