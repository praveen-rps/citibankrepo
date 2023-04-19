package springjdbcdemo.dao;

import java.util.List;

import springjdbcdemo.model.SalesTable;

public interface SalesDao {
	
	public List<SalesTable> listAll();
	public String addData(SalesTable sales);
	public String deleteData(String ename);
	public SalesTable searchTable(String ename);

}
