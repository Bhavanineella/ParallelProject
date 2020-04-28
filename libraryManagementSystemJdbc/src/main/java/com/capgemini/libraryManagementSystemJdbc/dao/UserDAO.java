package com.capgemini.libraryManagementSystemJdbc.dao;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.libraryManagementSystemJdbc.dto.BooksInfo;
import com.capgemini.libraryManagementSystemJdbc.dto.UserInfo;


public interface UserDAO {

	UserInfo authUser(String uname,String upassword);
	boolean registerUser(UserInfo ui);
	BooksInfo searchBooks(int bookid);
	boolean requestBook(int bid, String bAuthor);
	BooksInfo borrow(int bookid);
	
	LinkedList<BooksInfo> searchBookByTitle(String bname);
	LinkedList<BooksInfo> searchBookByAuthor(String bAuthor);
	LinkedList<BooksInfo> getBooksInfo();
	boolean returnBook(int bid);
	
}
