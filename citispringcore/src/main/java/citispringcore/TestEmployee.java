package citispringcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1 = (Employee) context.getBean("emp");
		Employee e2 = (Employee) context.getBean("emp");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.getName()+" "+e1.getDept());
		System.out.println(e1.getAddress());
		
		Address adr = (Address) context.getBean("addr");
		System.out.println(adr);
		
		Person person = (Person) context.getBean("p");
		System.out.println(person.getDept());

	}

}
