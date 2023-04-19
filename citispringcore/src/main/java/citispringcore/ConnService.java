package citispringcore;

import org.springframework.beans.factory.annotation.Autowired;

public class ConnService {
	
	@Autowired
	DbConnection db;
	
	public void display1() {
		db.getConnection();
	}
	
	public void display2() {
		db.getDriver();
	}


}
