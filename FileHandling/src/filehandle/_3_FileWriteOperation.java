package filehandle;

import java.io.*;

public class _3_FileWriteOperation {
	
	public static void main(String[] args) {
	
	try {
		BufferedWriter f=new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Shubham.txt"));
//	FileWriter f=new FileWriter("C:\\Users\\User\\Desktop\\Shubham.txt");
			
		try {
			f.write("Hello This is written using the fileHandling ok");
		}
		finally {
			f.close();
		}
			System.out.println("Sucesfully Data wrote ");
	}
	
	catch(IOException e){
		System.out.println(e);
	}
	
	}
}