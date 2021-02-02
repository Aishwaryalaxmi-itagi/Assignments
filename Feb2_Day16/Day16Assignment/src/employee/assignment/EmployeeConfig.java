package employee.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean
	public Employee getInstance() {
		return new Employee(2000, "asdf", 1000);
	}
}
