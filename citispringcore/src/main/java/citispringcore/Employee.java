package citispringcore;

public class Employee {
	
	private String name;
	private String dept;
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		
	}
	public Employee(String name, String dept, Address address) {
		super();
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
