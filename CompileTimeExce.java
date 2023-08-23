package ThirtyOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeExce {
	public static void main(String[] args) throws IOException
	{
		try
		{
		File f=new File("C:\\Users\\User\\OneDrive - Ciber Global LLC\\Desktop\\filing.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1)
		{
		char a=(char)(temp);
		System.out.println(a+" "+temp);
		}
		}
		catch(FileNotFoundException ffe)
		{
			System.out.println(ffe);
		}
	}
	

}
