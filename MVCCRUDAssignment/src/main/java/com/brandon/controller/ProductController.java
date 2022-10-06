package com.brandon.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.brandon.model.LoginBean;
import com.brandon.model.ProductBean;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	static int productID;
	static long productPrice;
	static int UproductID;
	static long UproductPrice;
	static int DproductID;
	static int SproductID;
	static String productName;
	static String UproductName;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			productID = Integer.parseInt(request.getParameter("prdID"));
		} catch (NumberFormatException nfe) {
		}

		productName = request.getParameter("prdName");

		try {
			productPrice = Long.parseLong(request.getParameter("prdPrice"));
		} catch (NumberFormatException nfe) {
		}

		try {
			UproductID = Integer.parseInt(request.getParameter("UprdID"));
		} catch (NumberFormatException nfe) {
		}

		UproductName = request.getParameter("UprdName");

		try {
			UproductPrice = Long.parseLong(request.getParameter("UprdPrice"));
		} catch (NumberFormatException nfe) {
		}

		try {
			DproductID = Integer.parseInt(request.getParameter("DprdID"));
		} catch (NumberFormatException nfe) {
		}

		try {
			SproductID = Integer.parseInt(request.getParameter("SprdID"));
		} catch (NumberFormatException nfe) {
		}

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		Session session = sf.openSession();// creating a new session
		// Session session1=sf.openSession();//creating a new session

		Transaction t = session.beginTransaction();
		if (productID > 0) {
			ProductBean p1 = new ProductBean();
			p1.setPrdId(productID);
			p1.setPrdName(productName);
			p1.setPrdPrice(productPrice);
			session.save(p1);
			out.print("Insert succesful!<br>");
			out.print("<input type=\"button\" value=\"Product Management System\"\r\n"
					+ "        onclick=\"window.location.href='ProductDetails.jsp'\" />");
			t.commit();
			productID = 0;
		}

		if (UproductID > 0) {
			ProductBean p2 = new ProductBean();
			p2.setPrdId(UproductID);
			p2.setPrdName(UproductName);
			p2.setPrdPrice(UproductPrice);
			session.merge(p2);
			out.print("Update succesful!<br>");
			out.print("<input type=\"button\" value=\"Product Management System\"\r\n"
					+ "        onclick=\"window.location.href='ProductDetails.jsp'\" />");
			t.commit();
			UproductID = 0;
		}

		if (DproductID > 0) {
			ProductBean p3 = new ProductBean();
			p3.setPrdId(DproductID);
			session.delete(p3);
			out.print("Deletion succesful!<br>");
			out.print("<input type=\"button\" value=\"Product Management System\"\r\n"
					+ "        onclick=\"window.location.href='ProductDetails.jsp'\" />");
			t.commit();
			DproductID = 0;
		}

		if (SproductID > 0) {
			ProductBean p4 = (ProductBean) session.load(ProductBean.class, SproductID);
			String query = p4.toString();
			String modifier = query.replace("ProductBean", "");
			String modifier2 = modifier.replaceAll("=", ":");
			String modifier3 = modifier2.replace("(", "");
			String modifier4 = modifier3.replace(")", "");
			String modifier5 = modifier4.replace("prdId", "ID");
			String modifier6 = modifier5.replace("prdName", "Name");
			String modifier7 = modifier6.replace("prdPrice", "Price");
			String result = modifier7.replaceAll(",", " | ");

			out.print("<h2>Search Result</h2><br>");
			out.print(" <table style=\"width: 100%\">\r\n" + "<tr>\r\n"
					+ "<td>Product Details</td>\r\n" + "</tr>\r\n" + "<tr>\r\n"
					+ "<td>" + result + "</td>\r\n" + "</tr>\r\n" + "</table>"
					+ "<br>");
			out.print("<input type=\"button\" value=\"Product Management System\"\r\n"
					+ "onclick=\"window.location.href='ProductDetails.jsp'\" />");
			SproductID =0;
		}

	}

}
