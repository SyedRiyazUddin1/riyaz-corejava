//Program of connecting the core java to MySql database

package com.javapractice.corejava.JDBC.examples;

import com.javapractice.corejava.util.MyLogger;

//Step 1: importing the package (java.sql.*;)
import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "root";
        String query = "SELECT * from mydatabase.student_details where student_id=4";

//        Scanner scanner = new Scanner(System.in);
//        MyLogger.consoleLogger.info("Please enter the query");
//
//        String query = scanner.nextLine();
//
//        query+=scanner.nextLine();
//        scanner.close();
//        MyLogger.consoleLogger.info(query);

        //Step 2: loading and registering the driver
        //registering the driver with forName method

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Statement statement = null;
        Connection connection = null;
        try {
            //establishing the connection with interface "Connection"
            connection = DriverManager.getConnection(url, username, password);

            //creating the statement
            statement = connection.createStatement();

            //processing the results
            ResultSet rs = statement.executeQuery(query);

            rs.next();
            String name = rs.getString("student_name");

            MyLogger.consoleLogger.info(name);

    } catch (SQLException e) {
        e.printStackTrace();
    }

        //closing the Connection and Statement
        statement.close();
        connection.close();


    }

}
