package com.location;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Start extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		PrintWriter out = res.getWriter();
		int userid = Integer.parseInt(req.getParameter("userid"));
		int questid = Integer.parseInt(req.getParameter("questid"));
		QuestData._quest = new ArrayList<Quest>();
		Quest a = new Quest(0, "national treasure", 100, QuestData._questions1);
		Quest b = new Quest(1, "Session", 100, QuestData._questions2);
		Quest c = new Quest(2, "Hellride", 200, QuestData._questions3);
		Quest d = new Quest(3, "1 corpus", 100, QuestData._questions4);
		QuestData._quest.add(a);
		QuestData._quest.add(b);
		QuestData._quest.add(c);
		QuestData._quest.add(d);
		if(!QuestData.map.containsKey(userid))
		{
			int i =  QuestData.map.size();
			QuestData.map.put(userid, i);
		}	
		
		try
		{
			QuestData.User.get(QuestData.map.get(userid));
		}
		catch(IndexOutOfBoundsException e)
		{
			QuestData.User.add(new ArrayList<Quest>());	
		}

		try
		{
			QuestData.qmap.get(QuestData.map.get(userid));
		}
		catch(IndexOutOfBoundsException e)
		{
			QuestData.qmap.add(new HashMap<Integer, Integer>());
		}

		
		if(!QuestData.qmap.get(QuestData.map.get(userid)).containsKey(questid))
		{
			int i = QuestData.qmap.get(QuestData.map.get(userid)).size();
			QuestData.qmap.get(QuestData.map.get(userid)).put(questid,  i);
		}
		
//		boolean exist = false;
//			
//			for(int i = 0; i < QuestData.User.get(QuestData.map.get(userid)).size(); i++)		
//			{
//				if(QuestData.User.get(QuestData.map.get(userid)).get(i).id() == QuestData.qmap.get(QuestData.map.get(userid)).get(questid))
//				{
//					exist = true;	
//				}
//				
//		}	
			try
			{
				QuestData.User.get(QuestData.map.get(userid)).get(QuestData.qmap.get(QuestData.map.get(userid)).get(questid));
			}
			catch(IndexOutOfBoundsException e)
			{
				Quest new_quest = QuestData._quest.get(QuestData.qmap.get(QuestData.map.get(userid)).get(questid));
				QuestData.User.get(QuestData.map.get(userid)).add(new_quest);
			}
			
//		Quest new_quest = QuestData._quest.get(QuestData.qmap.get(QuestData.map.get(userid)).get(questid));
//		if(!exist)
//		{
//			QuestData.User.get(QuestData.map.get(userid)).add(new_quest);
//		}
//		exist = false;
		int user_id = QuestData.map.get(userid);
		ArrayList<Quest> user_quests = QuestData.User.get(user_id);
		int quest_id = QuestData.qmap.get(user_id).get(questid);
		Quest quest = user_quests.get(quest_id);
		Quest q = quest;
		
		
		out.print("<h1>" + q.name() + "</h1>");
		out.print("<h2> Points: " + q.points() + "</h2>");

		out.close();
	}
}