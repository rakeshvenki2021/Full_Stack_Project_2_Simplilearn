package com.simplilearn.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		if(username.equals("admin") && password.equals("root")) {
			RequestDispatcher rd = req.getRequestDispatcher("welcomeservlet");
			rd.forward(req, res);
		}
		else{
			
			pw.print("Username or Password Incorrect!!!");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}

}