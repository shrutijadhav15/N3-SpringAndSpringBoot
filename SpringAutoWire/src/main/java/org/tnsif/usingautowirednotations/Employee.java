package org.tnsif.usingautowirednotations;

public class Employee {
	private String name;
	private String dept;
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//default
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor for employee");
	}
	
	

	public void power()
	{
		System.out.println("employee name is:"+name);
		System.out.println("employee e_department  is:"+dept);
	}
	
	

}
