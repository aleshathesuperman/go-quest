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
		int userid = Integer.parseInt(req.getParameter("userid"));
		int questid = Integer.parseInt(req.getParameter("questid"));	
		Quest q = QuestData.User.get(QuestData.map.get(userid)).get(QuestData.qmap.get(QuestData.map.get(userid))
				.get(questid));
		
		PrintWriter out = res.getWriter();
		out.print(q.currentIndex());
		out.close();
	}
}