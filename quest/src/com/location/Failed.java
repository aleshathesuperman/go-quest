package com.location;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Failed extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		
		Random r = new Random();
		int multipliers =  r.nextInt(1000) + 1; 
		int user_id = QuestData.userId() * multipliers; 
		int quest_id = QuestData.questId() * multipliers; 
		int success = 0 + multipliers; 
		String mult = sha1(Integer.toString(multipliers));
		
		PrintWriter out = res.getWriter();
		out.print("https://go-quest.000webhostapp.com/result/default/index?key1=" 
				+ user_id + "&key2=" + quest_id + "&key3=" + success + "&key4=" + mult);
		out.close();
	}
	
	String sha1(String input)
	{
        MessageDigest mDigest = null;
		try {
			mDigest = MessageDigest.getInstance("SHA1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }       
        return sb.toString();
    }
}
