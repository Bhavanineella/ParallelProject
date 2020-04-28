package com.capgemini.libraryManagementSystemJdbc.factory;

import com.capgemini.libraryManagementSystemJdbc.dao.AdminDAO;
import com.capgemini.libraryManagementSystemJdbc.dao.AdminDAOImplementation;
import com.capgemini.libraryManagementSystemJdbc.dao.UserDAO;
import com.capgemini.libraryManagementSystemJdbc.dao.UserDAOImplementation;
import com.capgemini.libraryManagementSystemJdbc.service.AdminService;
import com.capgemini.libraryManagementSystemJdbc.service.AdminServiceImplementation;
import com.capgemini.libraryManagementSystemJdbc.service.UserService;
import com.capgemini.libraryManagementSystemJdbc.service.UserServiceImplementation;

public class Factory {

	public static AdminDAO getAdminDAO() {
		return new AdminDAOImplementation();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplementation();
	}
	public static UserDAO getUserDAO() {
		return new UserDAOImplementation();
	}
	public static UserService getUserService() {
		return new UserServiceImplementation();
	}
	
}
