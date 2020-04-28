package com.capgemini.libraryManagementSystemJdbc.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.capgemini.libraryManagementSystemJdbc.dto.AdminInfo;
import com.capgemini.libraryManagementSystemJdbc.dto.BooksInfo;

public class AdminDAOImplementation implements AdminDAO{

	public AdminInfo auth(String aemail, String apassword) {
		
		return null;
	}

	public boolean registerAdmin(AdminInfo ai) {
		
		return false;
	}

	public boolean addBook(BooksInfo bi) {
		FileInputStream f=new FileInputStream("db.properties");
		
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); 

			String dburl=dburl1;

			conn = DriverManager.getConnection(dburl,"root","root");

			String query = " insert into BooksInfo values (?,?,?,?,?,?) ";

			pstmt = conn.prepareStatement(query);

					return false;
	}

	public boolean removeBook(int bid) {
		
		return false;
	}

	public boolean issueBook(int bid) {
		
		return false;
	}

	public LinkedList<BooksInfo> searchBookByTitle(String bname) {
	
		return null;
	}

	public LinkedList<BooksInfo> searchBookByAuthor(String bauthor) {
		
		return null;
	}

	public LinkedList<BooksInfo> getBooksInfo() {
		
		return null;
	}

	public boolean updateBook(int bid) {
		// TODO Auto-generated method stub
		return false;
	}

}
