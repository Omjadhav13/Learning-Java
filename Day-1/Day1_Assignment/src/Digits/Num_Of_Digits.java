package Digits;

public class Num_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7532,count=0;
		while(number!=0) {
			int digit =number%10;
			count++;
			number=number/10;
		}
		System.out.println(count);
	}

}
