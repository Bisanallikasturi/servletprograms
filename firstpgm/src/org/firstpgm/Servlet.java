package org.firstpgm;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//getparameter is present in requestobject
//servlet is use to perform business logic in service method and it two arguments(servlets request ,servlrt responce)
@WebServlet("/form")
public class Servlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("nm");
		String Email=req.getParameter("email");
    	String password=req.getParameter("pw");
    	
    	ServletOutputStream OutputStream = res.getOutputStream();
    	OutputStream.print("Welcome" +name);

	}

}
