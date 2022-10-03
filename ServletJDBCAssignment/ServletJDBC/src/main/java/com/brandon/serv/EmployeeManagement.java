package com.brandon.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeManagement extends HttpServlet{
	static int empiD;
	static String empName;
	static long empSal;

	static int uEmpId;
	static String uEmpName;
	static long uEmpSal;

	static int dEmpId;
	static int sEmpId;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter(); 
	    
	    try {
			empiD = Integer.parseInt(request.getParameter("empID"));
			empSal = Long.parseLong(request.getParameter("empSalary"));
		} catch (NumberFormatException nfe) {
		}
		empName = request.getParameter("empName");

		try {
			uEmpId = Integer.parseInt(request.getParameter("UempID"));
			uEmpSal = Long.parseLong(request.getParameter("UempSalary"));
		} catch (NumberFormatException nfe) {
		}
		uEmpName = request.getParameter("UempName");

		try {
			dEmpId = Integer.parseInt(request.getParameter("DempID"));
		} catch (NumberFormatException nfe) {
		}
		
		try {
			sEmpId = Integer.parseInt(request.getParameter("sEmpID"));
		} catch (NumberFormatException nfe) {
		}
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root")) {
			// PreparedStatement pst=con.prepareStatement("create table emp(eno
			// numeric(10),ename varchar(50),esal numeric(10), primary key(eno))");
			// pst.execute();

			// inserting new employee
			if (empName != null) {
				PreparedStatement pst = con.prepareStatement("insert into emp(eno,ename,esal) values(?,?,?)");
				pst.setInt(1, empiD);
				pst.setString(2, empName);
				pst.setLong(3, empSal);
				pst.executeUpdate();
				empiD = 0;
			}

			// updating employee values by id
			if (uEmpId != 0 && uEmpName != null) {
				PreparedStatement pstU = con.prepareStatement("UPDATE emp SET ename = ?, esal = ? WHERE eno = ?");
				pstU.setString(1, uEmpName);
				pstU.setLong(2, uEmpSal);
				pstU.setInt(3, uEmpId);
				pstU.executeUpdate();
				uEmpId = 0;
			}

			// Deleting employee value by id
			if(dEmpId != 0) {
			PreparedStatement pstD = con.prepareStatement("DELETE FROM emp WHERE eno = ?");
			pstD.setInt(1, dEmpId);
			pstD.executeUpdate();
			dEmpId = 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		if(sEmpId != 0 && empiD == 0 && uEmpId == 0 && dEmpId ==0) {    
	        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
	        rd.forward(request, response); 
	        sEmpId = 0;
	        }else {
        out.print("Change succesful!<br>");
        out.print("<input type=\"button\" value=\"Home Page\"\r\n" + 
        		"        onclick=\"window.location.href='index.html'\" />");}
		
        out.close();
	         
	    }  
}
