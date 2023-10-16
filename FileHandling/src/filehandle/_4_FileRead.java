package filehandle;

import java.io.FileReader;
import java.io.IOException;

//public class _4_FileRead {
//	public static void main(String[] args) {
//		try {
//			FileReader r= new FileReader("C:\\Users\\User\\Desktop\\Shubham.txt");
//			try {
//				int i;
//				while((i=r.read()) !=-1)
//				{
//					System.out.print((char)i);
//				}
//				}
//			
//			finally {
//				r.close();
//			}
//		}
//		
//		catch(IOException i) {
//			System.out.println("Exception Handle");
//			
//		}
//	}
//}

//or

public class _4_FileRead {
	public static void main(String[] args) throws IOException{
		
			FileReader r= new FileReader("C:\\Users\\User\\Desktop\\Shubham.txt");
				int i;
				while((i=r.read()) !=-1)
				{
					System.out.print((char)i);
				}
				r.close();
		}			
}
