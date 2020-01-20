package com.generation38.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import com.generation38.model.Employee;
import com.generation38.model.PayRoll;


@WebServlet("/CalculateSalaryServlet")
public class CalculateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8");
		PrintWriter out = response.getWriter();
		Employee employee = new Employee();
		double calculatedSalary = 0.0;
		
		String nameEmployee = request.getParameter("txtName");
		double salaryEmployee = Double.parseDouble(request.getParameter("txtSalary"));
		
		employee.setNameEmployee(nameEmployee);
		employee.setSalaryEmployee(salaryEmployee);
		
		calculatedSalary = PayRoll.CalculateSalaryEmployee(employee);
		
		out.append("Calculated Salary with taxes is:" + calculatedSalary);
		
		out.close();
	}

}
