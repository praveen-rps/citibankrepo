package springjdbcdemo.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springjdbcdemo.dao.SalesDao;
import springjdbcdemo.dao.SalesDaoImpl;
import springjdbcdemo.service.SalesService;
import springjdbcdemo.service.SalesServiceImpl;

@Configuration
public class SalesConfigs {
	
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/fisglobal");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(createDataSource());//a
		return template;
	}
	
	@Bean
	public SalesDaoImpl getSalesDao() {
		SalesDaoImpl dao = new SalesDaoImpl();
		dao.setTemplate(getTemplate());
		return dao;
	}
	
	@Bean("iservice")
	public SalesService getSalesServices() {
		SalesServiceImpl service = new SalesServiceImpl();
		service.setDao(getSalesDao());
		return service;
		
	}

}
