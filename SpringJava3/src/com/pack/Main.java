package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args){
	ApplicationContext c=new ClassPathXmlApplicationContext("hello.xml");
	Employee e=(Employee)c.getBean("emp");
	System.out.println(e);
	Employee e1=(Employee)c.getBean("emp");
	System.out.println(e1);
}
}
