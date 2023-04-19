package citispringcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfigs {
	
	@Bean
	public static Department getDepts() {
		return new Department(8888,"Testing");
	}
	
	@Bean("b1")
	public static Address returnAddress1() {
		return new Address(9999,"Koramangala","Bangalore");
	}
	
	@Bean("b2")
	public  static Address returnAddress2() {
		return new Address(5555,"SP Road","Hyderabad");
	}
	
	@Bean("p1")
	public Person returnPerson() {
		return new Person("kamal","Delhi",getDepts());
	}


}
