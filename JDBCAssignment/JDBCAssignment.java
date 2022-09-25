package com.brandon.JDBCAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the employee's 3 digit ID number: ");
		int empID = sc.nextInt();
		System.out.println("Please enter the employee's name: ");
		String empName = sc.next();
		System.out.println("Please enter the employee's salary: ");
		long empSal = sc.nextInt();

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept2022", "root", "root")) {

			// PreparedStatement pst=con.prepareStatement("create table emp(eno
			// numeric(10),ename varchar(50),esal numeric(10), primary key(eno))");
			// pst.execute();

			// inserting new employee
			PreparedStatement pst = con.prepareStatement("insert into emp(eno,ename,esal) values(?,?,?)");
			pst.setInt(1, empID);
			pst.setString(2, empName);
			pst.setLong(3, empSal);
			pst.executeUpdate();

			// updating employee values by id
			PreparedStatement pstU = con.prepareStatement("UPDATE emp SET ename = ?, esal = ? WHERE eno = ?");
			System.out.println("Please enter the ID of the employee you wish to update: ");
			int enoU = sc.nextInt();
			System.out.println("Please enter the employee's name: ");
			String enameU = sc.next();
			System.out.println("Please enter the employee's salary: ");
			long esalU = sc.nextLong();
			pstU.setString(1, enameU);
			pstU.setLong(2, esalU);
			pstU.setInt(3, enoU);
			pstU.executeUpdate();

			// Deleting employee value by id
			PreparedStatement pstD = con.prepareStatement("DELETE FROM emp WHERE eno = ?");
			System.out.println("Please enter the ID of the employee you wish to delete: ");
			int enoD = sc.nextInt();
			pstD.setInt(1, enoD);
			pstD.executeUpdate();

			// Performing Query
			PreparedStatement pstQuery = con.prepareStatement("select * from emp WHERE eno = ?");
			System.out.println("Please enter the ID of the employee you wish to look up: ");
			int enoQ = sc.nextInt();
			pstQuery.setInt(1, enoQ);

			ResultSet rs1 = pstQuery.executeQuery();
			while (rs1.next()) {
				int employeeNumber = rs1.getInt(1);
				String employeeName = rs1.getString(2);
				long employeeSalary = rs1.getLong(3);
				System.out.println("ID  Name  Salary");
				System.out.print(employeeNumber + " ");
				System.out.print(employeeName + " ");
				System.out.println("$" + employeeSalary);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
