package springjdbcdemo.model;

public class SalesTable {
	
	String ename;
	String job;
	int sal;
	public SalesTable() {
		
	}
	
	public SalesTable(String ename, String job, int sal) {
		super();
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "SalesTable [ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}
	
}
