package com.brandon.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
	static int sEmpId;
	static int employeeNumber = 0;
	static String employeeName = "";
	static long employeeSalary = 0;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			sEmpId = Integer.parseInt(request.getParameter("sEmpID"));
		} catch (NumberFormatException nfe) {
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root")) {

			PreparedStatement pstQuery = con.prepareStatement("select * from emp WHERE eno = ?");
			pstQuery.setInt(1, sEmpId);

			ResultSet rs1 = pstQuery.executeQuery();
			while (rs1.next()) {
				employeeNumber = rs1.getInt(1);
				employeeName = rs1.getString(2);
				employeeSalary = rs1.getLong(3);
			}
			if (employeeNumber == 0 && employeeName == "" && employeeSalary == 0) {
				out.print("No results found!<br>");
				out.print("<input type=\"button\" value=\"Home Page\"\r\n"
						+ "        onclick=\"window.location.href='index.html'\" />");
			} else {
				response.sendRedirect(
						"Query.jsp?id=" + employeeNumber + "&name=" + employeeName + "&salary=" + employeeSalary);
				sEmpId = 0;
				employeeNumber = 0;
				employeeName = "";
				employeeSalary = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
