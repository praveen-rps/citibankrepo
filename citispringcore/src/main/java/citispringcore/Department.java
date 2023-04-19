package citispringcore;

public class Department {
	int deptno;
	String dname;
	public Department() {
		
	}
	public Department(int deptno, String dname) {
		super();
		this.deptno = deptno;
		this.dname = dname;
	}
	public int getDeptno() {
		return deptno;
	}
	
	public String getDname() {
		return dname;
	}
	
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + "]";
	}
	
}
