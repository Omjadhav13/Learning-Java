
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city =new String("Mumbai");
		System.out.println(city);
		System.out.println(city.charAt(0));
		System.out.println(city.equals("Mumbai"));
		System.out.println(city.equalsIgnoreCase("mumbai"));//ignore cases and matches to it 		
		System.out.println(city.substring(3));//gives output from that index --> bai
		System.out.println(city.substring(2, 4));//gives output from index 2 till 4-3=3index mb
		System.out.println(city.replace('M', 'P'));//this will not replace the old object content it will create a new one 
		System.out.println(city);
		//to change the object we use this
		String newCity=city.replace('M', 'P');
		System.out.println(newCity);
		
		
		String s1="a";
		String s2="a";
		System.out.println(s1.equals(s2));//checks contents
		System.out.println(s1==s2);//checks references
		
		//but
		
		String s3="a";
		String s4="a";
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);

		
	}

}
