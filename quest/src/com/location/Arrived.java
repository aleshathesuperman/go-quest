package com.location;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Arrived extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int userid = Integer.parseInt(req.getParameter("userid"));
		int questid = Integer.parseInt(req.getParameter("questid"));
		
		double myLatitude =  Double.parseDouble(req.getParameter("latitude"));
		double myLongtitude =  Double.parseDouble(req.getParameter("longitude"));
		
		Question current = QuestData.User.get(QuestData.map.get(userid)).get(QuestData.qmap.get(QuestData.map.get(userid))
				.get(questid)).currentQuestion();
		double aimLatitude = current.latitude();
		double aimLongtitude = current.longitude();
		
		double coef = 0.0004;
		
		PrintWriter out = res.getWriter();
		if(myLatitude <= aimLatitude + coef && myLatitude >= aimLatitude - coef 
		&& myLongtitude <= aimLongtitude + coef && myLongtitude >= aimLongtitude - coef)
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
