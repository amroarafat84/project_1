package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;



@WebServlet( loadOnStartup = 1, urlPatterns= {"*.view"})
public class HeadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(HeadServlet.class);
       

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		log.trace("Inside HeadServlet");
		log.trace(request.getRequestURI());
		
		request.getRequestDispatcher("partials/login.html").forward(request, response);
	}

}
