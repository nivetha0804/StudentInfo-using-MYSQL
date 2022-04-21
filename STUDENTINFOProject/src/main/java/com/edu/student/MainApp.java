package com.edu.student;

import java.util.Scanner;

public class MainApp 
{
	public static void main(String[] args)
	{
		//Menu from user
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("DataBase Operations");
			System.out.println("Enter Your Choice");
			System.out.println("1.To display student information");
			System.out.println("2.Insert student record");
			System.out.println("3.Update student information based on ID");
			System.out.println("4.Delete student information based on ID");
			System.out.println("5.Select student record based on student ID");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:StudentDataOperations.displayStudentInfo();
			break;
			case 2:StudentDataOperations.insertStudentInfo();
			break;
			case 3:StudentDataOperations.updateStudentInfo();
			break;
			case 4:StudentDataOperations.deleteStudentInfo();
			break;
			case 5:StudentDataOperations.selectStudentInfo();
			break;
			default:System.out.println("INVALID CHOICE");
			}//switch
			System.out.println("DO YOU WANT TO CONTINUE y/n");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("n"))
			{
				break;
			}//if
		}//while loop
		System.out.println("Program terminated");
		sc.close();
	}//main
}//mainapp

