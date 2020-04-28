package com.capgemini.libraryManagementSystemJdbc.service;

import java.util.LinkedList;

import com.capgemini.libraryManagementSystemJdbc.dao.AdminDAO;
import com.capgemini.libraryManagementSystemJdbc.dto.AdminInfo;
import com.capgemini.libraryManagementSystemJdbc.dto.BooksInfo;
import com.capgemini.libraryManagementSystemJdbc.factory.Factory;


public class AdminServiceImplementation implements AdminService{
 
	private AdminDAO dao=Factory.getAdminDAO();
	
	
	public AdminInfo auth(String aemail, String apassword) {
	
		return dao.auth(aemail, apassword);
	}

	
	public boolean registerAdmin(AdminInfo ai) {

		return dao.registerAdmin(ai);
	}

	
	public boolean addBook(BooksInfo bi) {
	
		return dao.addBook(bi);
	}

	
	public boolean removeBook(int bid) {
	
		return dao.removeBook(bid);
	}

	
	public boolean issueBook(int bid) {
	
		return dao.issueBook(bid);
	}

	
	public LinkedList<BooksInfo> searchBookByTitle(String bname) {
		
		return dao.searchBookByTitle(bname);
	}

	public LinkedList<BooksInfo> searchBookByAuthor(String bauthor) {
		
		return dao.searchBookByAuthor(bauthor);
	}

	public LinkedList<BooksInfo> getBooksInfo() {
		
		return dao.getBooksInfo();
	}

	public boolean updateBook(int bid) {
		
		return dao.updateBook(bid);
	}
}
