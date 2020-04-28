package com.capgemini.libraryManagementSystemJdbc.dao;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.libraryManagementSystemJdbc.dto.AdminInfo;
import com.capgemini.libraryManagementSystemJdbc.dto.BooksInfo;

public interface AdminDAO {
	
	AdminInfo auth(String aemail,String apassword);
	boolean registerAdmin(AdminInfo ai);
	boolean addBook(BooksInfo bi);
	boolean removeBook(int bid);
	boolean issueBook(int bid);
	LinkedList<BooksInfo> searchBookByTitle(String bname);
	LinkedList<BooksInfo> searchBookByAuthor(String bauthor);
	LinkedList<BooksInfo> getBooksInfo();
	boolean updateBook(int bid);

}