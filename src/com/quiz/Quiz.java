package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz {
	int correctAns = 0;
	int wrongAns = 0;

	// b,a,d,c,b,c,a,b,c,c
	public void getQuizTest(String name) {
		Question q1 = new Question("Who is founder of java?", "a.Van Rossum", "b.James Gosling", "c.Dennis Ritchie",
				"d.Bjarne Stroustrup");
		Question q2 = new Question("When java was invented?", "a.1995", "b.1996", "c.1918", "d.1999");
		Question q3 = new Question("How many pillars of Oops concept?", "a.3", "b.2", "c.5", "d.4");
		Question q4 = new Question("How many methods in object class?", "a.13", "b.12", "c.11", "d.15");
		Question q5 = new Question("String is the class that represents sequence of……", "a.Object", "b.Character",
				"c.Class", "d.Array");
		Question q6 = new Question("Number of primitive data types in java are?", "a.6", "b.7", "c.8", "d.9");
		Question q7 = new Question("What is size of float and double in java?", "a.32 & 64", "b.32 & 32", "c.64 & 64",
				"d.64 & 32");
		Question q8 = new Question("Array in java are…", "a.Object reference", "b.Objects", "c.Primitive data type",
				"d.None");
		Question q9 = new Question("CompareTo() returns", "a.True", "b.False", "c.An int value", "d.None");
		Question q10 = new Question("Total constructor string class have?", "a.3", "b.7", "c.13", "d.20");

		HashMap<Question, Character> hm = new HashMap<>();
		hm.put(q1, 'b');
		hm.put(q2, 'a');
		hm.put(q3, 'd');
		hm.put(q4, 'c');
		hm.put(q5, 'b');
		hm.put(q6, 'c');
		hm.put(q7, 'a');
		hm.put(q8, 'b');
		hm.put(q9, 'c');
		hm.put(q10, 'c');

		

		for (Map.Entry<Question, Character> map : hm.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOpt_1());
			System.out.println(map.getKey().getOpt_2());
			System.out.println(map.getKey().getOpt_3());
			System.out.println(map.getKey().getOpt_4());

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Answer: ");
			Character ans = sc.next().charAt(0);

			int cans = Character.compare(ans, map.getValue());
			if (cans == 0) {

				correctAns++;

			} else {
				wrongAns++;
			}
		}
		System.out.println();
		System.out.println("--------Result---------");
		System.out.println("Total Questions: " + hm.size());
		System.out.println("Correct Answered Questions : " + correctAns);

		int Score = correctAns;

		if (Score > 8) {
			System.out.println("Garde : A");
			setStudentDetails(name, Score, "A");
		} else if (Score >= 5 && Score <= 8) {
			System.out.println("Grade : B");
			setStudentDetails(name, Score, "B");
		} else if (Score == 5) {
			System.out.println("Grade : C");
			setStudentDetails(name, Score, "C");
		} else {
			System.out.println("Fail");
			setStudentDetails(name, Score, "Fail");

		}

	}

	public void setStudentDetails(String name, int score, String grade) {
		ConnectionStud cs = new ConnectionStud();
		try {
			Connection con = cs.getConnectionDetails();
			PreparedStatement ps = con
					.prepareStatement("insert studentquiz (stud_name,stud_score,stud_grade) values (?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, score);
			ps.setString(3, grade);
			
			PreparedStatement ps1=con.prepareStatement("Update studentquiz stud_name=? where stud_id=?");
			int rs = ps.executeUpdate();
		} catch (Exception e) {

		}
	}
}
