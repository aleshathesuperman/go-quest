package com.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class QuestData {
	


	
	
	public static ArrayList<Question> _questions1 = 
			new ArrayList<Question>(Arrays.asList(
					new Question("Where we are?", "Here", 50.4645, 30.5179), //skovoroda
					new Question("Where they are?", "There", 50.4264, 30.4146)));	
	
	public static ArrayList<Question> _questions2 = 
			new ArrayList<Question>(Arrays.asList(
					new Question("Where i am ?", "Home", 50.4264, 30.4146),  //home
					new Question("On vht lesson?", "Yes", 50.4643, 30.5204)));	 //1corpus
	
	public static ArrayList<Question> _questions3 = 
			new ArrayList<Question>(Arrays.asList(
					new Question("I am here?", "Yes", 50.4643, 30.5204), //1 corpus 
					new Question("Grugorii?", "Skovoroda", 50.4645, 30.5179)));	 //skovoroda
	
	public static ArrayList<Question> _questions4 = 
			new ArrayList<Question>(Arrays.asList(
					new Question("I am here?", "Yes", 50.4643, 30.5204), //1 corpus 
					new Question("I am here?", "Yes", 50.4643, 30.5204)));
		
	public static ArrayList<Quest> _quest;	
	public static ArrayList<ArrayList<Quest>> User = new ArrayList<ArrayList<Quest>>();
	

	
	public static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();	
	public static int amount = 0;

	public static ArrayList<HashMap<Integer, Integer>> qmap = new ArrayList<HashMap<Integer, Integer>>();	
	public static int qamount = 0;
	

}

