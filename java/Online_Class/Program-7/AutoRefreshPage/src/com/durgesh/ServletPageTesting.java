package com.durgesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletPageTesting")
public class ServletPageTesting extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ServletPageTesting() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double price1=1.1,price2=1.1;
		response.setIntHeader("Refresh", 5);
		// Get current time
		DateFormat dateFormat = new SimpleDateFormat(" yyyy/MM/dd HH:mm:ss ");
		Date date = new Date();
		
		price1 = price1 * .43;
		price2 = price2 * 1.33;
	
		/*
		 * StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<body>")
                .append("<p>Employee has been registered successfully!</p>")
                .append("<br/>")
                .append("<a href='index.html'>Click Here to go to Home Page</a>")
                .append("</body>")
                .append("</html>");
        resp.getWriter().write(sb.toString());
		 */
		StringBuilder sb = new StringBuilder();
		 sb.append("<html>")
         .append("<body  style=background-color:e2e2e2;text-align:center;>")
         .append("<h1>"+"Auto Page Refresh using Servlet"+"</h1>")
         .append("<h2>Current Time is:</h2>" +dateFormat.format(date))
         .append("<table >")
         .append("<tr >")
         .append("<th align =center>Stock</th>")
         .append("<th align =center>Price</th>")
         .append("</tr>")
         .append("<tr ><td>TCS</td><td>"+price1+"</td></tr>")
         .append("<tr><td>Wipro</td><td>"+price2+"</td></tr>")
         .append("</table>")
         .append("</body>")
         .append("</html>");
		 response.getWriter().write(sb.toString());
	
		
	}

}
