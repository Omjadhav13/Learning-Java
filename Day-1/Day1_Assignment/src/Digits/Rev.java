package Digits;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=678;
		while(number!=0) {
			int digit=number%10;
			System.out.print(digit);
			number=number/10;
		}
	}

}
