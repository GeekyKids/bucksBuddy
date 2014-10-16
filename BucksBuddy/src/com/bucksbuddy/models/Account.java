package com.bucksbuddy.models;

import java.util.ArrayList;

import com.bucksbuddy.observer.Observable;

public class Account implements Observable
{
	ArrayList<User> listOfUser = new ArrayList<User>();
	private String name;
	ArrayList<Expense> listOfExpense = new ArrayList<Expense>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void addObserver(User newUser) {
		// TODO Auto-generated method stub
		listOfUser.add(newUser);
	}

	@Override
	public void deleteObserver(String userToDelete) {
		// TODO Auto-generated method stub
		for(int counter=0; counter<=listOfUser.size(); counter++)
		{
			if(listOfUser.get(counter).getUsername().equalsIgnoreCase(userToDelete))
				listOfUser.remove(counter);
		}
	}

	@Override
	public void notfiyObserver() {
		// TODO Auto-generated method stub
		for(int counter=0; counter<=listOfUser.size(); counter++)
			listOfUser.get(counter).update();
		
	}
	
}
