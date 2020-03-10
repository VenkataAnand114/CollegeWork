import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class Controller extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{  
		int i=0;
		// read data from the post in webpage  
		// this will be in controller class
		String name = request.getParameter("aName");  

		Model mv = new Model();
		
		String dept = mv.returnDept(name);
		// write session code here
		// this is a part of controller
		
		
		// the output stuff
		// this will be in view class
		PrintWriter out = response.getWriter(); 		
		out.println("<html>"+  
		"<head> <title> Greetings..</title> <style> body{ text-align:center;}</style>"+
		"</head>" + 
		"<body>"+               
		"<h1> Your Deparment is " + dept + "</h1>" +               
		"</body>"+    
		"</html>"); 
	} 
}
