
public class Manager extends Employee{
	private int incentives;
	public Manager(int incentives,String name,double basicSalary) {
		super(name,basicSalary);
		this.incentives=incentives;
	}
	@Override 
	public double calculateSalary() {
		return this.basicSalary+this.incentives;
	}
	@Override
	public void showDetails() {
		super.showDetails("=");
		System.out.println(this.id+"	\t"+this.name+"	\t"+calculateSalary());
	}
}
