package com.clc.loginweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.postgresql.jdbc2.EscapedFunctions;

import com.clc.loginweb.jdbcservice.LoginService;
import com.clc.loginweb.jdbcutil.JDBCUtil;

/**
 * Servlet implementation class Login
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String unameParameter;
	String pwordParameter;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginServlet(int m)
	{}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//should be same name
		unameParameter = request.getParameter("uname");
		pwordParameter = request.getParameter("pword");
		
		String page="";
		
		if(unameParameter==null||unameParameter.trim().isEmpty()||pwordParameter==null||pwordParameter.trim().isEmpty()){
			page="/WEB-INF/redirect.html";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
			requestDispatcher.forward(request, response);
		} else if(userCheck()){
			page="/WEB-INF/welcome.html";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
			requestDispatcher.forward(request, response);
		} else {
			page="/WEB-INF/validation.html";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
			requestDispatcher.forward(request, response);
		}		
		
		/*RequestDispatcher header = request.getRequestDispatcher("/WEB-INF/header.html");
		header.include(request, response);
		
		RequestDispatcher footer = request.getRequestDispatcher("/WEB-INF/footer.html");
		footer.include(request, response);*/
		
		Writer responseWriter = response.getWriter();
		responseWriter.write(page);
	}

	private boolean userCheck() {
		// TODO Auto-generated method stub

		ResultSet extractedResult = LoginService.extract();
		
		
			try {
				while(extractedResult.next()){
						
						if(unameParameter.equals(extractedResult.getString(1))){
							if(pwordParameter.equals(extractedResult.getString(2))){
								return true;
							}
						}
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				JDBCUtil.cleanUp(extractedResult);
			}
			
		return false;
	}
}
