class DemoSelectionConstructs{
	public static void main(String[] args){
		int numbers=1;
		
		if(numbers==1){
			System.out.println("ONE");
		}
		else if(numbers==2){
			System.out.println("TWO");
		}
		else if(numbers==3 ){
			System.out.println("THREE");
		}
		else {
			System.out.println("Incorrect value");
		}


		switch(numbers){
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			default:
				System.out.println("Incorrect value");
				break;	

		}

	}
}