package com.ds.usc;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("create table user_information (id number primary key , username varchar2(20), email varchar2(40), password varchar2(20), age number, education varchar2(20))");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into user_information (id ,username, email, password ,age ,education) values (?,?,?,?,?,?)");
            preparedStatement.setLong(1 , 1);
            preparedStatement.setString(2, "amirreza");
            preparedStatement.setString(3,"amiirds@gmail.com");
            preparedStatement.setString(4, "amiirds24");
            preparedStatement.setInt(5, 19);
            preparedStatement.setString(6,"diploma");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into user_information (id ,username, email, password ,age ,education) values (?,?,?,?,?,?)");
            preparedStatement.setLong(1 , 2);
            preparedStatement.setString(2, "amirali");
            preparedStatement.setString(3,"amirali@gmail.com");
            preparedStatement.setString(4, "amirali");
            preparedStatement.setInt(5, 23);
            preparedStatement.setString(6,"diploma");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into user_information (id ,username, email, password ,age ,education) values (?,?,?,?,?,?)");
            preparedStatement.setLong(1 , 3);
            preparedStatement.setString(2, "qoli");
            preparedStatement.setString(3,"qoli@gmail.com");
            preparedStatement.setString(4, "qoli123");
            preparedStatement.setInt(5, 18);
            preparedStatement.setString(6,"diploma");
            preparedStatement.executeUpdate();
      Scanner input = new Scanner(System.in);
      int id =0;
            System.out.println("*************LOGIN************");
            System.out.println("enter your username");
            String username = input.nextLine();
            System.out.println("enter your password");
            String pass = input.nextLine();
            if (username.equals("amirreza") && pass.equals("amiirds24") ||username.equals("amirali") && pass.equals("amirali") || username.equals("qoli") && pass.equals("qoli123") ){
                System.out.println("you successfully loged in");
                System.out.println("for update choose ");
                System.out.println("1-id\n2-username\n3-email\n4-password\n5-age\n6-education");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        preparedStatement = connection.prepareStatement("update user_information set id=? where id=?");
                        System.out.println("whats your main id that you want to update");
                        id = input.nextInt();
                        System.out.println("enter your new id number");
                        int temp = input.nextInt();
                        preparedStatement.setLong(1, temp);
                        preparedStatement.setLong(2, id);
                        preparedStatement.executeUpdate();
                        break;
                    case 2:
                        preparedStatement = connection.prepareStatement("update user_information set username=? where id=?");
                        System.out.println("whats your main user id that you want to update");
                        id = input.nextInt();
                        System.out.println("enter your new username ");
                        String temp1 = input.next();
                        preparedStatement.setString(1, temp1);
                        preparedStatement.setLong(2, id);
                        preparedStatement.executeUpdate();
                        break;
                    case 3:
                    preparedStatement = connection.prepareStatement("update user_information set email=? where id=?");
                    System.out.println("whats your main email id that you want to change");
                    id = input.nextInt();
                    System.out.println("enter your new email ");
                    String temp2 = input.next();
                    preparedStatement.setString(1, temp2);
                    preparedStatement.setLong(2, id);
                    preparedStatement.executeUpdate();
                    break;
                    case 4:
                        preparedStatement = connection.prepareStatement("update user_information set password=? where id=?");
                        System.out.println("whats your main password id that you want to change");
                        id = input.nextInt();
                        System.out.println("enter your new password ");
                        String temp3 = input.next();
                        preparedStatement.setString(1, temp3);
                        preparedStatement.setLong(2, id);
                        preparedStatement.executeUpdate();
                        break;
                    case 5:
                        preparedStatement = connection.prepareStatement("update user_information set age=? where id=?");
                        System.out.println("whats your main age id that you want to change");
                        id = input.nextInt();
                        System.out.println("enter your new age ");
                        int temp4 = input.nextInt();
                        preparedStatement.setInt(1, temp4);
                        preparedStatement.setLong(2, id);
                        preparedStatement.executeUpdate();
                        break;
                    case 6:
                        preparedStatement = connection.prepareStatement("update user_information set education=? where id=?");
                        System.out.println("whats your main education id that you want to change");
                        id = input.nextInt();
                        System.out.println("enter your new education ");
                        String temp5 = input.next();
                        preparedStatement.setString(1, temp5);
                        preparedStatement.setLong(2, id);
                        preparedStatement.executeUpdate();
                    break;
                    default:
                        System.out.println("try again");
                }
            }
            else System.out.println("username or password is incorrect");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        }
    }
}
