package citispringcore;

public class Person {
	
	String name;
	String city;
	Department dept;
	public Person() {
		
	}
	
	public Person(String name, String city, Department dept) {
		super();
		this.name = name;
		this.city = city;
		this.dept=dept;
	}

	public Department getDept() {
		return dept;
	}

	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	

}
