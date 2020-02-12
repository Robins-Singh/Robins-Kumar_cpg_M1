package com.raj.jdbclabEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AuthorDatabase {

	public static void main(String[] args) throws Exception {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		do {
			System.out.println("Enter choice here : ");
			choice= Integer.parseInt(br.readLine());
			
			if(choice==1) {
				insert();
			}
			
			if(choice==2) {
				System.out.println("------");
				System.out.println("Update Details here");
				System.out.println("------");
				System.out.println("Enter Author Id : ");
				int id= Integer.parseInt(br.readLine());
				System.out.println("Enter new Phone no : ");
				int phone= Integer.parseInt(br.readLine());
				update(id,phone);
			}
			if(choice==3) {
				System.out.println("------");
				System.out.println("Delete Records here");
				System.out.println("------");
				System.out.println("Enter Author Id : ");
				int id= Integer.parseInt(br.readLine());
				delete(id);
			}
			if(choice==4) {
				display();
			}
			
			if(choice==0)
				break;
			
		}while(choice!=0);
		
		br.close();
		System.out.println("Good Bye...");
	}

	private static void display() throws SQLException {
	Connection	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("------");
		System.out.println("Displaying Records here....");
		System.out.println("------");
		String sql="select * from author";
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		stmt.close();
		conn.close();
	}

	private static void delete(int id) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		String sql="delete from author where authorId = "+id;
		Statement stmt = conn.createStatement();
		
		int r = stmt.executeUpdate(sql);
		
		if(r>0)
			System.out.println("Deleted Succeessfully");
		else
			System.out.println("Unsuccessfull");
		
		stmt.close();
		conn.close();
		
	}

	private static void update(int id, int phone) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		String sql="update author set phoneNo = "+phone+" where authorId = "+id;
		Statement stmt = conn.createStatement();
		
		int r = stmt.executeUpdate(sql);
		
		if(r>0)
			System.out.println("Update Succeessfully");
		else
			System.out.println("Unsuccessfull");
		
		stmt.close();
		conn.close();
		
	}

	private static void insert() throws Exception {
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		Scanner s = new Scanner(System.in);


		String sql="insert into author values(author_seq.nextval,?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);

		System.out.println("Enter first name : ");
		String fname=s.next();
		System.out.println("Enter middle name : ");
		String mname=s.next();
		System.out.println("Enter last name : ");
		String lname=s.next();
		System.out.println("Enter phone no : ");
		int phone=s.nextInt();	
		
		stmt.setString(1, fname);
		stmt.setString(2, mname);
		stmt.setString(3, lname);
		stmt.setInt(4, phone);

		
		
		int i = stmt.executeUpdate();
		System.out.println(i+" row inserted");
		stmt.close();
		conn.close();
		
	
	}
}
