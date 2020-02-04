//Program of connecting the core java to MySql database

package com.javapractice.corejava.JDBC.examples;

import com.javapractice.corejava.util.MyLogger;

//Step 1: importing the package (java.sql.*;)
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "root";
        String query;
        query = "SELECT * from mydatabase.student_details where student_id=3";

        //Step 2: loading and registering the driver
        //registering the driver with forName method
        Class.forName("com.mysql.cj.jdbc.Driver");

        //establishing the connection with interface "Connection"
        Connection con = DriverManager.getConnection(url, username, password);

        //creating the statement
        Statement st = con.createStatement();

        //processing the results
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("student_name");

        MyLogger.consoleLogger.info(name);

        //closing the Connection and Statement
        st.close();
        con.close();


    }

}
