import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		File file = new File("D://Test");

		if (file.isDirectory()) {
			File[] fileArray = file.listFiles();
			
			
			for (File fl : fileArray) {
				if (fl.isFile()) {
//					System.out.println(fl.getName());
//					System.out.println(fl.getAbsoluteFile());
//					System.out.println(fl.getCanonicalFile());
//					System.out.println(fl.getParent());
//					System.out.println(fl.getTotalSpace());
					System.out.println(fl.length());
					if (fl.getName().equalsIgnoreCase("test - Copy (9).txt")) {
						fl.delete();
					}
				}

			}

		}
//		File tempFile = new File("D://Test/abc.txt");
//		
////		tempFile.delete();
//		tempFile.deleteOnExit();
//		tempFile.getAbsoluteFile();
		

		
//		FileOutputStream fOut;
//		try {
//			fOut = new FileOutputStream("D://test.txt");
//			String str = "ABC";
//			fOut.write(str.getBytes());
//			fOut.flush();
//			fOut.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileOutputStream fOut;
		
		try {
			fOut = new FileOutputStream("D://test123.txt");
			
			BufferedOutputStream bout = new BufferedOutputStream(fOut);
			String str = "ABC";
			bout.write(str.getBytes());
			bout.flush();
			bout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		FileInputStream fIn;
		try {
			fIn = new FileInputStream("D://test123.txt");
			BufferedInputStream bout = new BufferedInputStream(fIn);
			   int i=0;    
	            while((i=bout.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            //ACCSI Value
	            bout.close(); 
		} catch (IOException e) {
			System.out.println("From catch block");
		}

	}

}
