package employee.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext("employee.assignment");
	Employee e=context.getBean(Employee.class);
	
	System.out.println(e);
	e.Printdetails();
	
	
}
}
