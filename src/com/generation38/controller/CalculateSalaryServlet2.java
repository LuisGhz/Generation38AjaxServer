package com.generation38.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generation38.model.Employee;
import com.generation38.model.PayRoll;

/**
 * Servlet implementation class CalculateSalaryServlet2
 */
@MultipartConfig
@WebServlet("/CalculateSalaryServlet2")
public class CalculateSalaryServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset='utf-8");
		PrintWriter out = response.getWriter();
		Employee employee = new Employee();
		double calculatedSalary = 0.0;
		
		String nameEmployee = request.getParameter("txtName");
		double salaryEmployee = Double.parseDouble(request.getParameter("txtSalary"));
		
		employee.setNameEmployee(nameEmployee);
		employee.setSalaryEmployee(salaryEmployee);
		
		calculatedSalary = PayRoll.CalculateSalaryEmployee(employee);
		
		out.append("{\"Calculated Salary\" : " + calculatedSalary + " }");
		
		out.close();
	}

}
