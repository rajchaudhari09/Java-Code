package com.bridgelabz.bootcampprograms.day1;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[]args) {
		int Leapyear;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		Leapyear=sc.nextInt();
		if ((Leapyear%400==0)||((Leapyear%4==0)&&(Leapyear%100!=0))) 
			System.out.println(" is leap year");
		
		else
			System.out.println(" not leap year");
			
	      }
}
