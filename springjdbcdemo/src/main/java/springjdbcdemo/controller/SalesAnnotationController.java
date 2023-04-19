package springjdbcdemo.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springjdbcdemo.configs.SalesConfigs;
import springjdbcdemo.model.SalesTable;
import springjdbcdemo.service.SalesService;

public class SalesAnnotationController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext(SalesConfigs.class);
		
		SalesService service= (SalesService)context.getBean("iservice");
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp name");
		String ename = sc.next();
		SalesTable temp = service.searchTable(ename);
		if(temp==null)
			System.out.println("Data is not found");
		else
			System.out.println(temp);
		*/
		
		List<SalesTable> data = service.listAll();
		data.forEach(System.out::println);
		

	}

}
