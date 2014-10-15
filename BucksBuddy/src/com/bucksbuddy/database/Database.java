package com.bucksbuddy.database;

import java.util.List;

import com.bucksbuddy.models.Account;
import com.bucksbuddy.models.Expense;
import com.bucksbuddy.models.User;

public interface Database {
	public List<Account> getAccountsList(User u);
	public List<Expense> getExpensesList(User u);
	public List<Expense> getExpensesList(Account a);
	public User getUserByEmail(String email);
}
