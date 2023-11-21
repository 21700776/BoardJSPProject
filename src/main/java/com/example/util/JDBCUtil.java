package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://walab.handong.edu:3306/p231_21700776","p231_21700776","ad1IeV");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }

//public static void main(String ars[]) {
//		Connection conn = getConnection();
//		if(conn != null)
//    		System.out.println("DB 연결됨!");
//		else
//	}
}