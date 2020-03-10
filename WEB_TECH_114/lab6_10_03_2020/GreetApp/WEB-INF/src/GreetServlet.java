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

		// do some calculations
		// model class
		StringTokenizer stoken = new StringTokenizer(name,"-");
		String codes[] = new String[4];
		String dept = "";
		
		while( stoken.hasMoreTokens()){
			codes[i++] = stoken.nextToken();
		}
		
		i = Integer.parseInt(codes[2]);
		
		switch( i ){
			case 732: dept = "Civil Engineering";
						break;
			case 733: deept = "Computer Science Engineering";
						break;
			case 734: dept = "Electronics and Electrical Engineering";
						break;
			case 735: dept = "Electronics and Communication Engineering";
						break;
			case 736: dept = "Mechanical Engineering";
						break;
			case 737: dept = "Information Technology";
						break;
			default: dept = "department not found";
		}
		// write session code here
		// this is a part of controller
		
		
		// the output stuff
		// this willl be in view class
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
