package com.dynamic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.location.Quest;
import com.location.QuestData;

@SuppressWarnings("serial")
public class QuestionsDone extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		Quest q = QuestData.quest();
		PrintWriter out = res.getWriter();
		out.print(q.currentIndex());
		out.close();
	}
}