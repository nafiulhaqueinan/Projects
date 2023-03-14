package classes;

import java.lang.*;

public final class Employee{

	private String empId;
	private String name;
	private double salary;


	public Employee(){};
	public Employee( String empId ,String name,double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}

	public void setEmpId(String empId){this.empId = empId;}
	
	public String getEmpId(){return empId;}

	public void setSalary(double salary){this.salary = salary ; }

	public double getSalary(){return salary;}

	
}
