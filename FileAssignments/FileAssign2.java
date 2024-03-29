package FileAssignments;
import java.io.*;
import java.util.*;
public class FileAssign2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> countrymap=new HashMap<String, String>();
		int count=0;
		String country="";
		String capital="";
        File file=new File("D:\\FileAssignment\\country.txt");
        
        
		try {
			file.createNewFile();
		
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
//		
//		country=br.read(); //logic of reading data need to work on
//		capital=br.read(); //logic of reading data to work on
//		
		while(count==5){//
			// write a condition for terminating 
			String line=br.readLine();
			String[] countrycapvalue=line.split(",");
			countrymap.put(countrycapvalue[0],countrycapvalue[1]);
			count++;
		}
		
	
		System.out.println(countrymap);
		
		
		
		}
		catch(Exception e) {
			System.out.println("error has occured");
		}

	}

}
