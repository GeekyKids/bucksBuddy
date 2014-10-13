package com.bucksbuddy.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private String email;
	private String password;
	private List<Account> accountsList;
	private List<Expense> expenseList;
	//private List<User> friendsList;
	//private List<User> sentFriendRequestList;
	
	public User(String userName, String email, String password) {
		// TODO Auto-generated constructor stub
		this.username  = userName;
		this.email = email;
		this.password = password;
		accountsList = new ArrayList<Account>();
		expenseList = new ArrayList<Expense>();
		//friendsList = new ArrayList<User>();
		//sentFriendRequestList = new ArrayList<User>();
	}
	

	public List<Account> getAccountsList() {
		return accountsList;
	}


	public void setAccountsList(List<Account> accountsList) {
		this.accountsList = accountsList;
	}


	public List<Expense> getExpenseList() {
		return expenseList;
	}


	public void setExpenseList(List<Expense> expenseList) {
		this.expenseList = expenseList;
	}

/*
	public List<User> getFriendsList() {
		return friendsList;
	}


	public void setFriendsList(List<User> friendsList) {
		this.friendsList = friendsList;
	}


	public List<User> getSentFriendRequestList() {
		return sentFriendRequestList;
	}


	public void setSentFriendRequestList(List<User> sentFriendRequestList) {
		this.sentFriendRequestList = sentFriendRequestList;
	}
*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
