package demo_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fs=null;
		
		try{
			fs=new FileInputStream("readme.txt");
			System.out.println("File opened");
			int data=fs.read();
			while(data!=-1) {
				System.out.print((char)data);
				data=fs.read();
				}

		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
