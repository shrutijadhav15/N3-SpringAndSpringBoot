package org.tnsif.usingautowirednotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	private Employee emp;
@Autowired
@Qualifier("e1")
	public void setEmp(Employee emp) 
	{
		
		this.emp = emp;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor for remote");
	}
public void accept()
{
	emp.power();
}
}
