package com.location;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UserId extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		QuestData.userId(Integer.parseInt(req.getParameter("id")));
		
		PrintWriter out = res.getWriter();
		out.print(req.getParameter("id"));
		out.close();
	}
}