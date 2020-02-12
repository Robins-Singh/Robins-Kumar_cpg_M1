package com.raj.jdbclabEx3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Book{
	private int ISBN;
	private String name;
	private int price;
	private int author_id;
	public Book(String name, int price, int author_id) {
		super();
		this.name = name;
		this.price = price;
		this.author_id = author_id;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
}


class Author{
	private int id;
	private String name;
	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class LabEx3 {
	public static void selectBookTitles(Connection conn, String author_name) {
		String command = "select name from book_table where author_id in (select id from author_table where name = '" + author_name + "')";
		try {
			Statement st = conn.createStatement();
			ResultSet set = st.executeQuery(command);
			while(set.next()) {
				System.out.println(set.getString(1));
			}
			conn.commit();
			st.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void setDetails(Connection conn, Book book) {
		String command = "insert into book_table values (book_seq.nextval, '" + book.getName() + "' , " + book.getPrice() + ", " + book.getAuthor_id() + ")";
		try {
			Statement st = conn.createStatement();
			int r = st.executeUpdate(command);
			conn.commit();
			System.out.println(r + " rows inserted..");
			st.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void updatePrice(Connection conn, String author_name, int price) {
		String command = "update book_table set price = " + price + " where author_id in (select id from author_table where name = '" + author_name + "' )";
		try {
			Statement st = conn.createStatement();
			int r = st.executeUpdate(command);
			conn.commit();
			System.out.println(r + " row updated");
			st.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	
		
		try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")){
			
			selectBookTitles(conn, "punit raj");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
