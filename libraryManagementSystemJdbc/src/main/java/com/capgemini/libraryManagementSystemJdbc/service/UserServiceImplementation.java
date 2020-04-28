package com.capgemini.libraryManagementSystemJdbc.service;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.libraryManagementSystemJdbc.dao.UserDAO;
import com.capgemini.libraryManagementSystemJdbc.dto.BooksInfo;
import com.capgemini.libraryManagementSystemJdbc.dto.UserInfo;
import com.capgemini.libraryManagementSystemJdbc.factory.Factory;


public class UserServiceImplementation implements UserService{
	
	private UserDAO dao=Factory.getUserDAO();

	
	public UserInfo authUser(String uname, String upassword) {
		
		return dao.authUser(uname, upassword);
	}
	
	public boolean registerUser(UserInfo ui) {
		
		return dao.registerUser(ui);
	}

	public boolean requestBook(int bid, String bAuthor) {
		return dao.requestBook(bid, bAuthor);
	}

	public BooksInfo borrow(int bookid) {
	
		return dao.borrow(bookid);
	}

	
	public BooksInfo searchBooks(int bookid) {
		
		return dao.searchBooks(bookid);
	}

	public LinkedList<BooksInfo> searchBookByTitle(String bname) {
		
		return dao.searchBookByTitle(bname);
	}

	
	public LinkedList<BooksInfo> searchBookByAuthor(String bAuthor) {
		
		return dao.searchBookByAuthor(bAuthor);
	}

	
	public LinkedList<BooksInfo> getBooksInfo() {
		
		return dao.getBooksInfo();
	}

	
	public boolean returnBook(int bid) {
		
		return dao.returnBook(bid);
	}
	

}
