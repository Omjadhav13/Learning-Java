package demodate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Date d =new Date();
		
		System.out.println(d);
		
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yy");
		
		String strDate = df.format(d);
		System.out.println(strDate);
		
		//String to date
		Date d1;
		try {
			d1 = df.parse("");
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
