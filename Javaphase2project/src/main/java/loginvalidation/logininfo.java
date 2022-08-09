package loginvalidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logininfo
 */
@WebServlet("/Loginpage")
public class logininfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Username=request.getParameter("varshini");	
    String  Password=request.getParameter("varshini@123");
    response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	
	
	if(Username.equals("varshini")&&Password.equals("varshini@123")) {
		out.println("<center><h1>Welcome to LoginPage "+Username+"!!<h1><reset>");
		out.println("</br> You are Successfully Login!!");

		out.println("<form action=\"logout\">"+"<p style=\text-align:rigt\";><input type= \"Submit\"  value=\"Logout\"></p>"+"</form");
	}
	else {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
		out.println("<center><p style=\"color:Red; font-size:25px;\">Invalid user or password");
	    rd.include(request, response);
}}}
