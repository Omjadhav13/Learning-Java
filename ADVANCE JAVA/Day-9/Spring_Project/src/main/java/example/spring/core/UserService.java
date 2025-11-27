package example.spring.core;

public class UserService implements GreetingService {

	private String name;
	private int age;
	
	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String greeting="Hi " +name+" , your age "+ age;
		return greeting;
	}
	public UserService() {
	
	}
	public UserService(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserService [name=" + name + ", age=" + age + "]";
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
