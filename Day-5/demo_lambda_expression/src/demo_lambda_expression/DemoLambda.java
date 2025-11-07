package demo_lambda_expression;

public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Printable p =()->{};
//		Printable p1=()-> {return 7;};
		Printable p1=()-> 7;
		System.out.println(p1.cal());
		
//optional		Taxable sal=(double b)-> { return b*0.2;};
//optional		Taxable sal=(b)-> { return b*0.2;};
//		Taxable sal=b->  {return b*0.2;};
		Taxable sal=b->   b*0.2;
		System.out.println(sal.sal(5000));
		
//		StringJoiner sj=(String s1,String s2)->{ return "hello "+s1+" "+s2;};
//		StringJoiner sj=(s1,s2)->{ return "hello "+s1+" "+s2;};
		StringJoiner sj=(s1,s2)-> "hello "+s1+" "+s2;
		System.out.println(sj.joins("Om", "Jadhav"));
		
		Searchable s=(String data)->{return (data.equalsIgnoreCase("om"))? true :false;};
		Searchable a= (data)-> data.equalsIgnoreCase("om")? true :false;
		Searchable b= data-> data.equalsIgnoreCase("om")? true :false;
		
		System.out.println(s.search("om"));
		System.out.println(a.search("aman"));
		System.out.println(b.search("aman"));
		
		StringLength s1=(String data)->{return data.length();};
		StringLength s2=( data)->{return data.length();};
		StringLength s3= data->{return data.length();};
		StringLength sl= data -> data.length();
		
		System.out.println(sl.getLength("om"));
		
	
	}

} 
