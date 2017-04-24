package com.location;

public class Question {	
	public Question(String question, String answer, double latitude, double longitude)
	{
		_question = question;
		_answer = answer;
		_latitude = latitude;
		_longitude = longitude;
	}
	
	public String question() { return _question; }
	public String answer() { return _answer; }
	public double longitude() {return _longitude; }
	public double latitude() {return _latitude; }
	
	private String _question;
	private String _answer;
	private double _longitude;
	private double _latitude;
}
