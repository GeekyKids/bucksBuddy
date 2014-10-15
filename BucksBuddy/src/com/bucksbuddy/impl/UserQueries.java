package com.bucksbuddy.impl;

import java.util.List;

import com.bucksbuddy.models.Account;

public interface UserQueries {
	public List<Account> getAccountsList(String email);
}
