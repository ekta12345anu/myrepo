package springcore.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DependencyInjection {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
		
	}

}
