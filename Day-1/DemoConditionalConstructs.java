class DemoConditionalConstructs{
	public static void main(String[] args){
		int age;	//variable declaration
		age=2;		//assigning value

		char nationality;
		nationality='I';

		if(age>18 && nationality=='I'){
			System.out.println("Eligible for voting");
		}
		else{
			System.out.println("Not eligible for voting");
		}
	}
}