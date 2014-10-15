package com.bucksbuddy.database;

import com.bucksbuddy.models.Constants;

public class DatabaseFactory {
	public static Database getDatabase(){
		if(Constants.DB_NAME.equalsIgnoreCase(Constants.DB_OODB)){
			return new OODatabase();
		}else if(Constants.DB_NAME.equalsIgnoreCase(Constants.DB_SQL)){
		}
		return null;
	}
}
