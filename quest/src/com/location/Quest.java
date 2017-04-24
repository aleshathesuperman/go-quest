package com.location;

import java.util.ArrayList;

public class Quest {
	public Quest(String name, int points, ArrayList<Question> questions)
	{
		if(questions == null) throw new NullPointerException("Question list is empty"); 
		_name = name;
		_points = points;
		_questions = questions;
		_current = 0;
	}
	
	public int size() { return _questions.size(); }
	public Question currentQuestion() 
	{ 
		return _questions.get(_current); 
	}
	public boolean next()
	{
		++_current; 
		return !(_current >= size());
	}
	public boolean end()
	{
		return _current == size();
	}
	
	public void fromStart()
	{
		_current = 0;
	}
	
	public String name() { return _name; }
	public int points() { return _points; }
	public ArrayList<Question> questions() { return _questions; }
	public int currentIndex() { return _current; }
	
	private String _name;
	private int _points;
	private ArrayList<Question> _questions;
	private int _current;
}
