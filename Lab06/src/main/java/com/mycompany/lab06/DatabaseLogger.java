package com.mycompany.lab06;

public class DatabaseLogger extends BaseLogger{
    public DatabaseLogger() {
		label = "Database logger";
	}
 
	public String getLevel() {
		return "info";
	}
}