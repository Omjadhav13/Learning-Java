import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.ycpait.studentManagementpp.entity.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		
		//serialization
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("StudentsData.txt");//step2
			oos=new ObjectOutputStream(fos);//step3
//			Student s=new Student("om",96f);
//			oos.writeObject(s);//step4
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
