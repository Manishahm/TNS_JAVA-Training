package org.tnsif.acc.c2tc.jdbcdemo;

import java.sql.Connection;//Represents a connection to the database.
import java.sql.DriverManager;//Manages JDBC drivers and establishes connections.
import java.sql.SQLException;//Handles SQL-related exceptions (errors) that occur during database operations.

public class PostgresJDBC { // This class contains the main method and the logic to connect to the PostgreSQL database.

	public static void main(String[] args) {
//jdbcUrl: The URL for connecting to PostgreSQL (using the JDBC PostgreSQL driver).
		//localhost refers to the local machine, 5432 is the default port for PostgreSQL, and postgres is the database name.
		    String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
	        String username = "postgres";//The PostgreSQL username, in this case, postgres
	        String password = "root";//The password for the PostgreSQL user (root in this case).

//try-with-resources: This ensures the Connection object (conn) is automatically closed after usage, which is good for resource management.
	        try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "root")) {

	            if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }

	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}