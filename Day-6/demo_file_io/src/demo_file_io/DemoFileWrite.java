package demo_file_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fs=null;
		try {
			fs=new FileOutputStream("readme.txt");
			fs.write(65);
			
			fs.close();
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fs.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
