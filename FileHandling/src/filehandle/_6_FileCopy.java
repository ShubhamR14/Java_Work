package filehandle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _6_FileCopy {
	public static void main(String[] args) throws IOException {
		
		FileInputStream r=new FileInputStream("C:\\Users\\User\\Desktop\\Rathod.txt");
		FileOutputStream w =new FileOutputStream("C:\\Users\\User\\Desktop\\Shubham.txt");
		
		int i;
		while((i=r.read()) !=-1) {
			w.write((char)i);
		}
		System.out.println("Copy Sucessfull");
	}
}
