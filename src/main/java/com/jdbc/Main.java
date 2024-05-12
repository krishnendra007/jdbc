package com.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {


        
        String url="jdbc:mysql://localhost:3306/krish";
        String uname ="root";
        String pass ="krish";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);


        //  1. SHOWING data 
        // String query ="select * from Student ";
        // Statement st = con.createStatement();
        // ResultSet rs=st.executeQuery(query);

        // while (rs.next()) {
        //     String result = rs.getString("name") + " " + rs.getInt("id");  
        //     System.out.println(result);
        // }


        // 2. ADDING data
        //  String query ="insert into Student values ( 5, 'guddu') ";
        // Statement st = con.createStatement();

        // int linesUpdated =st.executeUpdate(query);
        // System.out.println(linesUpdated);


        // 3. Adding using preparestatement
        // String query ="insert into Student values ( ?,?) ";
        // String addName="Mohan";
        // int addID =10;

        // PreparedStatement st =con.prepareStatement(query);
        // st.setInt(1, addID);
        // st.setString(2 , addName);

        //  int linesUpdated =st.executeUpdate();
        //  System.out.println(linesUpdated);



        // 4. DELETE
        String query ="delete from Student where id =5 ";
        Statement st = con.createStatement();
        int efectedRow =st.executeUpdate(query);

        System.out.println(efectedRow);


    }
}
