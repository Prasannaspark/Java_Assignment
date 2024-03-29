package FileAssignments;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class Assignment3 {
	public static void WriteToFile(String newFilename, char countryNameBeginningWith)
	{
		try
		{
			FileWriter fw = new FileWriter(newFilename);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader("D:\\File\\country.csv");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null)
			{
				if((line.charAt(0) == countryNameBeginningWith) && (!line.isEmpty()))
				{
					bw.write(line);
				}
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException 
	{
		File newFile = new File("D:\\File\\country1.csv");
		WriteToFile(newFile.getAbsolutePath(),'N');
	}
 
}
