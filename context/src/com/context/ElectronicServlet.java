package com.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ed")
public class ElectronicServlet extends HttpServlet {
//after body tag we make use of form action
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Product pro = new Product();
		pro.id = 1234;
		pro.name = "Ear phone";
		pro.price = 12344;
		pro.brand = "Mejestic";

		ServletContext context = getServletContext();
		String ref = context.getInitParameter("name1");
		String ref1 = context.getInitParameter("name2");

		ServletOutputStream servletOutputStream = resp.getOutputStream();
		servletOutputStream.print("<html><body bgcolor='lightpink'>" + "<h1>'" + ref + "' '" + ref1 + "'<h1>"
				+"<h2>Thanks for electronic device''" + pro.name + "''</h2>"

				+ "<a href='context.html\'>Back<a/>" + "</body>" + "</html>");

	}
}
