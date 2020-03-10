import java.io.*;
import java.util.*;

public class Model {
	
	// do some calculations
	// model class
	public String returnDept(  String name) {
		StringTokenizer stoken = new StringTokenizer(name,"-");
		String codes[] = new String[4];
		String dept = "";
		int i = 0;
		
		while( stoken.hasMoreTokens()){
			codes[i++] = stoken.nextToken();
		}
		
		i = Integer.parseInt(codes[2]);
		
		switch( i ){
			case 732: dept = "Civil Engineering";
						break;
			case 733: dept = "Computer Science Engineering";
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
		
		return dept;
	}
}
