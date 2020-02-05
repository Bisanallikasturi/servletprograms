package servlet.chaining.pgm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/flipcart")
public class flipcart extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	String product =req.getParameter("pr");
	String quantity =req.getParameter("qt");
	
	RequestDispatcher rd= req.getRequestDispatcher("SecondFlipCart");
	rd.forward(req, resp);
}
}
