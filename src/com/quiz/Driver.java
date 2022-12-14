package com.quiz;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***************Welcome to Quiz Competition***************");
		System.out.print("Enter student name :");
		String name=sc.next();
		
		Quiz q=new Quiz();
		q.getQuizTest(name);
	}
	
}
