package com.javapractice.corejava.JDBC.examples;

import com.javapractice.corejava.util.MyLogger;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "root";
        String query;
        query = "SELECT * from mydatabase.student_details where student_id=3";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getString("student_name");

        MyLogger.consoleLogger.info(name);
        st.close();
        con.close();


    }

}
