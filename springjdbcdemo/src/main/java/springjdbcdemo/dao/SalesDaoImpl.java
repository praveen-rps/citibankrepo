package springjdbcdemo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import springjdbcdemo.model.SalesMapper;
import springjdbcdemo.model.SalesTable;

public class SalesDaoImpl implements SalesDao {
	
	JdbcTemplate template;
	

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<SalesTable> listAll() {
		// TODO Auto-generated method stub
		String sql = "select * from salestable";
		return template.query(sql, new SalesMapper());
		
	}

	public String addData(SalesTable sales) {
		// TODO Auto-generated method stub
		String sql = "insert into salestable values(?,?,?)";
		template.update(sql,sales.getEname(),sales.getJob(),sales.getSal());
		
		return "data is inserted";
	}

	public String deleteData(String ename) {
		// TODO Auto-generated method stub
		String sql = "delete from salestable where ename=?";
		template.update(sql,ename);
		return null;
	}

	public SalesTable searchTable(String ename) {
		// TODO Auto-generated method stub
		String sql = "select * from salestable";
		String sql1 = "select ename,job from salestable";
		SalesTable table=null;
		boolean found=false;
		List<SalesTable> results = template.query(sql, new SalesMapper());
		for(SalesTable t :results) {
			if(t.getEname().equals(ename)) {
				found=true;
				table=t;
				break;
			}
		}
		if(found)
			return table;
		else
			return null;
	}

}
