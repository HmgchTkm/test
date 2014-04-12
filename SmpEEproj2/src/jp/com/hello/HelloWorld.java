package jp.com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends javax.servlet.http.HttpServlet{

	public void doGet(HttpServletRequest reqest , HttpServletResponse respose) throws IOException{
		
		PrintWriter out = respose.getWriter();
		out.println("HelloWorld2");
	}
	
}