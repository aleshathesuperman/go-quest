package com.location;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Answer extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		String rightAnswer = QuestData.quest().currentQuestion().answer();
		String myAnswer = req.getParameter("answer");
		PrintWriter out = res.getWriter();
		if(rightAnswer.equals(myAnswer))
		{
			out.print("true");
		}
		else
		{
			out.print("false");
		}
		out.close();
	}
}