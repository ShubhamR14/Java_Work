package filehandle;

import java.io.File;

public class _5_FileRename {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\User\\Desktop\\Shubham.txt");
		File r=new File("C:\\Users\\User\\Desktop\\Rathod.txt");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File Dosent Exist");
		}
	}
}
