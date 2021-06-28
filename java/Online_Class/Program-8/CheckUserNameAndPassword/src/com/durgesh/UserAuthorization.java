package com.durgesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet(urlPatterns="/UserAuthorization",initParams=@WebInitParam(name="rvce",value="rvce"))
public class UserAuthorization extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserAuthorization() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		ServletConfig sc = getServletConfig();
		String pass = sc.getInitParameter("rvce");
		String uname = request.getParameter("username");
		String passw = request.getParameter("password");
		if(uname.equalsIgnoreCase("rvce") && passw.equalsIgnoreCase(pass)) {
		pw.println(" username and password is valid ");
		}else {
		pw.println(" username and password is invalid ");
		}

	}

}
