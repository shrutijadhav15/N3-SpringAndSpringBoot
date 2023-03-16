package org.tnsif.autowiredexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
     Cake k=c.getBean("cake",Cake.class);
     k.accept();
     
	}

}
