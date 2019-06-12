import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Student;

public class TestMyTestClass {
	
	public static void main(String[] args){
		
	/*	Student student1 =new Student();
		student1.setName("123");
		student1.displayInfo();*/
		/*Resource resource=new ClassPathResource("applicationContext.xml");
		
//		ApplicationContext context =   new ClassPathXmlApplicationContext("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("studentbean1");
	    Student student1=(Student)factory.getBean("studentbean1");
	    student1.displayInfo();
	    student.displayInfo(); */
		
		TestMyTestClass testMyTestClass = new TestMyTestClass();
		
		Student student =  new Student("Ekta");
		System.out.println(testMyTestClass.getClass().getName().intern());
	}

}
