package Digits;

public class Skip_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1007,result=0,newNum=1;
		while(number>0) {
			int digit=number%10;
			if(digit!=0) {
				result+=digit*newNum;
				newNum*=10;
			}
			
			number=number/10;
		}
		System.out.println(result);
	}

}
