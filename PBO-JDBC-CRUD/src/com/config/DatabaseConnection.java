package com.config;
import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/halal_supermarket";
    private static final String USERNAME = "halalsupermarket";
    private static final String PASSWORD = "halalkansaja321";


    private static Connection connect;

    public static void connection() {
        try {
            Class.forName(JDBC_DRIVER);

            connect = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}