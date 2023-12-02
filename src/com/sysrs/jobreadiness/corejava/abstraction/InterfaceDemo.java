package com.sysrs.jobreadiness.corejava.abstraction;

/**
 * An interface in Java is a collection of abstract methods that define the
 * behavior a class must implement.
 */
interface DatabaseConnection {
	// abstract method without implementation
	void get_connection();
}

class SqlConnection implements DatabaseConnection {
	// implementing the get_connection() abstract method
	@Override
	public void get_connection() {
		System.out.println("Connected to SQL Database");
	}
}

class OracleConnection implements DatabaseConnection {
	@Override
	public void get_connection() {
		System.out.println("Connected to Oracle Database");
	}
}

class MySqlConnection implements DatabaseConnection {
	@Override
	public void get_connection() {
		System.out.println("Connected to MySQL Connection");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		// Creating object of a class that implements an interface
		DatabaseConnection sqlDatabaseConnection = new SqlConnection();
		// calling sqlDatabaseConnection method to connect to SQL Database
		sqlDatabaseConnection.get_connection();
	}

}
