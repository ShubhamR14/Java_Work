package filehandle;

import java.io.File;

public class _2_FileIndo {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\User\\Desktop\\Shubham.txt");
		
		if(f.exists()) {
			System.out.println("File name ="+f.getName());
			System.out.println("File Location ="+f.getAbsolutePath());
			System.out.println("File Writable ="+f.canWrite());
			System.out.println("Fiel Readable ="+f.canRead());
			
			System.out.println("File size ="+f.length());
//			System.out.println("File Removed ="+f.delete());
		}
		else
		{
			System.out.println("File Dosent Exist");
		}
	}
	
}
