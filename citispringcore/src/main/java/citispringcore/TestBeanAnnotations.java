package citispringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataConfigs.class);
		
		Address addr= (Address)context.getBean("b2");
		System.out.println(addr);
		
		Person p = (Person) context.getBean("p1");
		System.out.println(p.getName()+" "+p.getCity()+" "+p.getDept());

	}

}
