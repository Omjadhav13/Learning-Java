package demowhileloop;

public class DemoWhileLoop {

	public static void main(String[] args){
		int number=97,i=2;
		boolean isPrime=true;
		while(i<number){
			if(number%i==0){
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime){
			System.out.println("Its a prime Number");
		}
		else
			System.out.println("Its not a prime Number");

	}

}
