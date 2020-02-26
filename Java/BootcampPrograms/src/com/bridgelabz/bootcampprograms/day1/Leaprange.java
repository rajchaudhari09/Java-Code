package com.bridgelabz.bootcampprograms.day1;
import java.util.Scanner;

public class Leaprange {
	public static void main(String args[]) {
		int year;
		//Scanner sc =new Scanner(System.in);
	 	//System.out.println("enter the no");
		//year=sc.nextInt();
		for(int i=2000;i<=2020;i++) {
			if ((i%400==0)||((i%4==0)&&(i%100!=0))) 
				System.out.println(" is leap year"+i);
			
			else
				System.out.println(" not leap year"+i);
				
		      }
	
			
		}
	}


