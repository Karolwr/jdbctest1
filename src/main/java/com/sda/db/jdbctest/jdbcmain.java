package com.sda.db.jdbctest;

import java.sql.*;

public class jdbcmain {

    public static final String URL = "jdbc:mysql://localhost:3306/person?serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "41karol";
    public static final String SQL = "update zadanie set nazwisko='Poniatowski' where id='1'";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            int numberUpdates = statement.executeUpdate(SQL);

//           // odczytywanie danych z bazy danych
//            while (resultSet.next()){
//                int id =resultSet.getInt("id");
//                String name = resultSet.getString("imie");
//                String secondName = resultSet.getString("nazwisko");
//                int age = resultSet.getInt("wiek");
//
//                System.out.println("Dane osobowe: " + name + " " + secondName+" "+age);
//            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
