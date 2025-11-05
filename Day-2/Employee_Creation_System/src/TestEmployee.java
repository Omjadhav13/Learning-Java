
public class TestEmployee {
	
	private static int count;
	
	private int id;
	private String name;
	private double basicSalary;
	
	public TestEmployee(String name,double basicSalary) {
		count++;
		this.id=count;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	public double calculateSalary() {
		return this.basicSalary+2000;
	}
	public static int getCount() {
		return count;
	}
	void showDetails() {
		System.out.println(this.id+"	\t"+this.name+"	\t"+calculateSalary());
	}
	void showDetails(String format) {
		
		for(int i=1;i<=50;i++)
			System.out.print(format);
		
		System.out.println();
		System.out.println(this.id+"	\t"+this.name+"	\t"+calculateSalary());
	}

	
	
	
	
	
}
