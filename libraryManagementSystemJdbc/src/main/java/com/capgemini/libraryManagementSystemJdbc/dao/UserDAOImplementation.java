package com.capgemini.libraryManagementSystemJdbc.dao;

import java.util.LinkedList;

import com.capgemini.libraryManagementSystemJdbc.dto.BooksInfo;
import com.capgemini.libraryManagementSystemJdbc.dto.UserInfo;

public class UserDAOImplementation implements UserDAO{

	public UserInfo authUser(String uname, String upassword) {
		
		return null;
	}

	public boolean registerUser(UserInfo ui) {
		
		return false;
	}

	public BooksInfo searchBooks(int bookid) {
		
		return null;
	}

	public boolean requestBook(int bid, String bAuthor) {
		
		return false;
	}

	public BooksInfo borrow(int bookid) {
		
		return null;
	}

	public LinkedList<BooksInfo> searchBookByTitle(String bname) {
		
		return null;
	}

	public LinkedList<BooksInfo> searchBookByAuthor(String bAuthor) {
		
		return null;
	}

	public LinkedList<BooksInfo> getBooksInfo() {
		
		return null;
	}

	public boolean returnBook(int bid) {
		
		return false;
	}

}
