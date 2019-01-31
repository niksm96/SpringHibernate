package com.bridgelabz.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//		Resource r = new ClassPathResource("applicationContextCI.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
//
//		Employee s = (Employee) factory.getBean("e");
//		s.show();
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContextCI.xml");
		Employee emp=applicationContext.getBean(Employee.class);
		emp.show();
	}
}
