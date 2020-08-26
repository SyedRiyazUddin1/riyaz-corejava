package com.corejava.JDBC;
/**
 * Program to perform JDBC operations using Savepoint concept
 */

import com.corejava.util.MyLogger;

import java.sql.*;

public class SavePointTest {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Registering the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Creating the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
        //Creating the statement
        Statement st = con.createStatement();

        //Setting the autoCommit to false which means
        //the data will not be saved in the db until we commit explicitly
        //cant rollback if autocommit is true
        con.setAutoCommit(false);

        //Performing insertion operations
        st.executeUpdate("insert into movies values ('SRK','Don')");
        st.executeUpdate("insert into movies values ('Allu Arjun','Arya')");

        //setting up the savepoint after the above two operations
        Savepoint sp = con.setSavepoint();

        //performing one more insertion operation
        st.executeUpdate("insert into movies values ('Amir Khan','Dabang')");

        MyLogger.consoleLogger.info("Oops, wrong entry! Rolling back after the savepoint...");
        con.rollback();
        con.releaseSavepoint(sp);
        MyLogger.consoleLogger.info("Operations has been rolled back from savepoint");

        con.commit();
        con.close();
    }
}
