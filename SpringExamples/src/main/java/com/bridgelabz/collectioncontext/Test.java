package com.bridgelabz.collectioncontext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.collectioncontext.Question;

@SuppressWarnings("deprecation")
public class Test {
	public static void main(String[] args) {
//		Resource r = new ClassPathResource("application-context.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
//
//		Question q = (Question) factory.getBean("q");
//		q.displayInfo();
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
		Question question=(Question) applicationContext.getBean("q");
		question.displayInfo();
	}
}
