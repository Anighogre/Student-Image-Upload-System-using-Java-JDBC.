package com.ani.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ani.beans.Student;
import com.ani.services.StudentService;

public class StudentDataUser 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		StudentService service = new StudentService();
		
		while(true)
		{
			System.out.println("Press 1 for inserting the detail \r\n"
					+ "Press 2 for exit\r\n"
					+ "Enter your choice: 1\r\n"
					+ "");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1->{
				System.out.println("Enter Student Name :");
				String name = sc.nextLine();
				System.out.println("Enter Student Id :");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Student Address :");
				String addrs = sc.nextLine();
				
				File file = new File("C:\\Users\\ani\\OneDrive\\Pictures\\ganeshji.jpg");
				
				try {
					FileInputStream inputStream = new FileInputStream(file);
					std = new Student(name, id, addrs, inputStream);
					int insertData = service.insertData(std);
					
					if(insertData>=1)
					{
						System.out.println("Data inserted successfully!!\n");
					} else {
						System.err.println("Data not inserted!!!\n");
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			}
		}
	}
}
