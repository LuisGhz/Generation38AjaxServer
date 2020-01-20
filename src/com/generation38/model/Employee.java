package com.generation38.model;

public class Employee {
	private String nameEmployee;
	private double salaryEmployee;
	
	public Employee(){}
	
	public Employee(String nameEmployee, double salaryEmployee)
	{
		this.nameEmployee = nameEmployee;
		this.salaryEmployee = salaryEmployee;
	}
	
	public void setNameEmployee(String nameEmployee)
	{
		this.nameEmployee = nameEmployee;
	}
	
	public String getNameEmployee()
	{
		return nameEmployee;
	}
	
	public void setSalaryEmployee(double salaryEmployee)
	{
		this.salaryEmployee = salaryEmployee;
	}
	
	public double getSalaryEmployee()
	{
		return salaryEmployee;
	}
	

	
	@Override
	public String toString()
	{
		return String.format("Employee: %s Salary: %f", nameEmployee, salaryEmployee);
	}
}
