package com.bridgelabz.ciobjectsample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.ciobjectsample.Employee;

@SuppressWarnings("deprecation")
public class Test {
	public static void main(String[] args) {

//		Resource r = new ClassPathResource("application-context.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
//
//		Employee s = (Employee) factory.getBean("e");
//		s.show();
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
		Employee emp=(Employee) applicationContext.getBean("e");
		emp.show();

	}
}
