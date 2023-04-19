package springjdbcdemo.service;

import java.util.List;

import springjdbcdemo.dao.SalesDao;
import springjdbcdemo.dao.SalesDaoImpl;
import springjdbcdemo.model.SalesTable;

public class SalesServiceImpl implements SalesService {
	
	
	SalesDaoImpl dao;

	public SalesDaoImpl getDao() {
		return dao;
	}

	public void setDao(SalesDaoImpl dao) {
		this.dao = dao;
	}

	public List<SalesTable> listAll() {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	public String addData(SalesTable sales) {
		// TODO Auto-generated method stub
		return dao.addData(sales);
	}

	public String deleteData(String ename) {
		// TODO Auto-generated method stub
		return dao.deleteData(ename);
	}

	public SalesTable searchTable(String ename) {
		// TODO Auto-generated method stub
		return dao.searchTable(ename);
	}

}
