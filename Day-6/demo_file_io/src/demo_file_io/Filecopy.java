package demo_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy {

	public static void main(String[] args) {
		FileInputStream fs=null;
		FileOutputStream fos=null;
		try {
			fs=new FileInputStream("readme.txt");
			System.out.println("opened readme file");
			
			fos=new FileOutputStream("creadme.txt");
			System.out.println("opened creadme file");
			
			int data=fs.read();
			System.out.println("Copying data");
			
			while(data!=-1) {
				fos.write(data);
				data=fs.read();
				
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fs.close();
				fos.close();
				System.out.println("All file Closed");
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
