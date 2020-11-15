package com.ds.usc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        String email;
        String pass;
        String user;
        System.out.println("please enter your username");
        user = input.nextLine();
        System.out.println("please enter your password");
        pass = input.nextLine();
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into information (fullname,email,password,username) values (?,?,?,?)");
            preparedStatement.setString(1, "amirreza delavaran");
            preparedStatement.setString(2, "amiirds@gmail.com");
            preparedStatement.setString(3," amir12");
            preparedStatement.setString(4, "amirreza");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into information (fullname,email,password,username) values (?,?,?,?)");
            preparedStatement.setString(1, "amiralids");
            preparedStatement.setString(2, "amir2GMAIL.COM");
            preparedStatement.setString(3, "ali123");
            preparedStatement.setString(4, "ali");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into information (fullname,email,password,username) values (?,?,?,?)");
            preparedStatement.setString(1, "rezads");
            preparedStatement.setString(2, "ami432GMAIL.COM");
            preparedStatement.setString(3, "reza43");
            preparedStatement.setString(4, "reza123");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            if ("amirreza".equals(user) && "amir12".equals(pass) || "ali123".equals(user) && "ali".equals(pass) || "reza123".equals(user) && "reza43".equals(pass)) {
                System.out.println("you successfully lodged in");
            } else System.out.println("error not recognize you ");
            System.out.println("done");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        }
    }
}
