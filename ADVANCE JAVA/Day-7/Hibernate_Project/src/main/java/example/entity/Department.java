package example.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Department_Master")
public class Department {
     @Id
     @Column(name="Dept_id")
	private Integer deptNO;
     @Column(name="Dept_name",length=20)
	private String name;
     @Column(name="dept_Loc",length=30)
	private String location;
     
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="dept_id")
	private List<Employee> employeeList; 
	
	public Department() {
		employeeList=new ArrayList<>();
	}

	public Integer getDeptNO() {
		return deptNO;
	}

	public void setDeptNO(Integer deptNO) {
		this.deptNO = deptNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
	public Department(Integer deptNO, String name, String location, List<Employee> employeeList) {
		super();
		this.deptNO = deptNO;
		this.name = name;
		this.location = location;
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Department [deptNO=" + deptNO + ", name=" + name + ", location=" + location + ", employeeList="
				+ employeeList + "]";
	}

}
