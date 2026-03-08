package org.tnsif.acc.c2tc.jdbcdemo;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class PostgresTableCreation {
   public static void main( String args[] ) {
//(for connection) and stmt (for statement), initializing them as null so they can later hold the database connection and SQL statement, respectively.
      Connection c = null;
      Statement stmt = null; //send SQL queries to the database.
      try {
         Class.forName("org.postgresql.Driver");//The forName method is used to dynamically load the PostgreSQL JDBC driver class (org.postgresql.Driver) at runtime
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "root");
         System.out.println("Opened database successfully");

         stmt = c.createStatement();//createStatement() method is part of the Connection class, and it creates an object of type Statement. This Statement object is what you use to send SQL queries (commands) to the database.
         String sql = "CREATE TABLE COMPANY " +
            "(ID INT PRIMARY KEY     NOT NULL," +
            " NAME           TEXT    NOT NULL, " +
            " AGE            INT     NOT NULL, " +
            " ADDRESS        CHAR(50), " +
            " SALARY         REAL)";
         stmt.executeUpdate(sql);//used to execute the SQL command stored in the sql variable-> SQL query defined earlier to create the COMPANY table in the database.
         stmt.close();
         c.close();//Closes both the Statement object and the Connection to release the resources and disconnect from the database.
      } catch ( Exception e ) {
//e.getClass(): This method returns the class of the exception object (e). It tells you the type of exception (for example, SQLException).
//getName(): This returns the name of the exception class as a string.
//e.getMessage(): This method retrieves the specific error message associated with the exception
    	  //java.sql.SQLException: Connection failed
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);//EXIT THE PROGRAM
      }
      System.out.println("Table created successfully");
   }
}