
public class DemoArray {

	public static void main(String[] args) {
		
		//if we don't pass values to this array an exception is generated
		System.out.println(args[0]);
		// 1-way
		int [] numbers;
		numbers = new int[3];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		//2-way
		float[] marks =new float[2];
		marks[0]=3.33f;
		marks[1]=2.22f;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		
		//3-way
		String [] subject = {"English","Maths","History"};
		for(int i=0;i<subject.length;i++) {
			System.out.println(subject[i]);
		}
		//Enhanced for loop
		for(String show : subject) {
			System.out.println(show);
		}
	}

}
