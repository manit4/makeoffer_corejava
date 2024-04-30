import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pydata.Coffee2;

@Configuration
@ComponentScan(basePackages = "com.test, com.pydata, com.qualifier")
public class SpringConfig {
	
	public SpringConfig() {
		System.out.println(("inside SpringConfig constr...."));
	}
	
	@Bean
	public Coffee2 getCoffee2() {
		System.out.println("inside getCoffee2()");
		
		return new Coffee2();
	}
	
	

}
