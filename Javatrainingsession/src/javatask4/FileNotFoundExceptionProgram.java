package javatask4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionProgram {

	public static void main(String[] args) {
		try
		{
			String filename="C:\\Users\\aravi\\git\\JavaTask1\\Javatrainingsession\\datafiles1";
		File f=new File(filename);
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			String line=sc.nextLine();
			System.out.println(line);
		}
		sc.close();

	}
		catch(FileNotFoundException e)
		{
			System.out.println("The file is not present in the location specified");
		}

}
}
