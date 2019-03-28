package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dto.LoginUser;
import com.revature.dto.User;
import com.revature.service.UserService;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(Login.class);
	private UserService userService = new UserService();


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.trace(request.getRequestURL());
		ObjectMapper mapper = new ObjectMapper();
		LoginUser temp = mapper.readValue(request.getInputStream(), LoginUser.class);
		log.trace(temp);
		User user = userService.getUserByUserName(temp.getUserName());
		log.trace(user);
		
	}

}
