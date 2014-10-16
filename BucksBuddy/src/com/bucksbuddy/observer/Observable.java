package com.bucksbuddy.observer;

import com.bucksbuddy.models.User;

public interface Observable {
	public void addObserver(User newUser);
	public void deleteObserver(String userToDelete);
	public void notfiyObserver();
}
