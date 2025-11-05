
public class Employee {
	
	private static int count;
	
	protected int id;
	protected String name;
	protected double basicSalary;
	
	public Employee(String name,double basicSalary) {
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
