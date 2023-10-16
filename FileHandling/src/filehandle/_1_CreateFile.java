package filehandle;

import java.io.*;

public class _1_CreateFile {

	public static void main(String[] args)  throws IOException  {
		
		File f=new File("C:\\Users\\User\\Desktop\\Shubham.txt");
		
		// Here the exception occur so we use try catch or throws in main
		if(f.createNewFile())
		{
			System.out.println("Sucessfully created");
		}
		else
		{
			System.out.println("Already Exitxt");
		}
	}

}
