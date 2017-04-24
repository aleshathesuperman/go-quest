package com.location;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Start extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		
		QuestData.map.put(QuestData.amount, Integer.parseInt(req.getParameter("id")));
		++QuestData.amount;
		
		
		//adding
		ArrayList<Question> _questions = 
				new ArrayList<Question>(Arrays.asList(
						new Question("Where i am ?", "Here", 50.4264, 30.4146), 
						new Question("Wher we are ?", "There", 50.4264, 30.4146)));	
		//50.4645, 30.5179
		
		Quest _quest = new Quest("Black Pistol", 100, _questions);
		//adding
		
		
		QuestData.User.add(_quest);
		
		Quest q = QuestData.quest();
		PrintWriter out = res.getWriter();
		out.print("<h1 class=\'centered\'>" + q.name() + "<h1>");
		out.print("<h2 class=\'centered\'> Points: " + q.points() + "<h2>");
		out.close();
	}
}