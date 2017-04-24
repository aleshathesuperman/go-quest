package com.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

 
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

public class QuestData {
	private static ArrayList<Question> _questions = 
			new ArrayList<Question>(Arrays.asList(
					new Question("Where i am ?", "Here", 50.4264, 30.4146), 
					new Question("Wher we are ?", "There", 50.4264, 30.4146)));	
	//50.4645, 30.5179
	
	private static int _user_id;
	private static int _quest_id;	
	private static Quest _quest = new Quest("Black Pistol", 100, _questions);
	
	public static ArrayList<Quest> User = new ArrayList<Quest>();
	public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static int amount = 0;
	
	
	public static  ArrayList<Quest> User() { return User; }
	public static Quest quest() { return _quest;}
	
	
	public static void fromStart() { quest().fromStart(); }
	public static int userId() { return _user_id;}
	public static int questId() { return _quest_id;}
	public static void userId(int id) { _user_id = id;}
	public static void questId(int id) { _quest_id = id;}
}
