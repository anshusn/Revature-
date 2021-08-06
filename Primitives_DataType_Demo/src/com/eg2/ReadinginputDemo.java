package com.eg2;

import java.util.Scanner;

public class ReadinginputDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		//String name=sc.next();- first word of name will print only
		String name=sc.nextLine();
		System.out.println("Enter your age: ");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter your salary: ");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter your contact number: ");
		long contact=Long.parseLong(sc.nextLine());
		
		System.out.println("Hello "+name);
		System.out.println("age : "+age);
		System.out.println("salary: "+salary);
		System.out.println("Contact number: "+contact);
		}
	}
