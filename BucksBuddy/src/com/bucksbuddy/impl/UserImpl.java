package com.bucksbuddy.impl;

import java.util.List;

import com.bucksbuddy.database.Database;
import com.bucksbuddy.database.DatabaseFactory;
import com.bucksbuddy.models.Account;
import com.bucksbuddy.models.User;

public class UserImpl implements UserQueries{

	@Override
	public List<Account> getAccountsList(String email) {
		// TODO Auto-generated method stub
		Database db = DatabaseFactory.getDatabase();
		User currentUser = db.getUserByEmail(email);
		return db.getAccountsList(currentUser);
	}
	
}
