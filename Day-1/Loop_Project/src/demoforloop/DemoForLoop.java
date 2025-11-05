package demoforloop;

public class DemoForLoop {

	public static void main(String[] args){
		for(int j=1;j<=30;j++){
			System.out.println("Table of "+j); 
			for(int i=1;i<=10;i++){
				System.out.println(j+" x "+i+" = " +j*i);
			}
			System.out.println();
		}
	}

	
}
