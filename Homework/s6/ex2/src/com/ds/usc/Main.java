package com.ds.usc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement
//             preparedStatement = connection.prepareStatement("create table info(id number primary key ,name varchar(40),code_meli number ,father_name varchar(20) ,jtitle varchar(20),salary number ,history number )");
//            preparedStatement.executeUpdate(); //sakhte jadval
            preparedStatement = connection.prepareStatement("insert into info(id, name, code_meli, father_name, jtitle, salary, history) values (?,?,?,?,?,?,?)");
            System.out.println("1-Entering data\n2-Delete data ");
            int choice = input.nextInt();
                 switch (choice){
                 case 1:
                     System.out.println("enter your id number");
                     preparedStatement.setInt(1, input.nextInt());
                     System.out.println("please enter your name");
                     preparedStatement.setString(2, input.next());
                     System.out.println("enter your code_meli ");
                     preparedStatement.setLong(3, input.nextInt());
                     System.out.println("please enter your father name");
                     preparedStatement.setString(4, input.next());
                     System.out.println("please enter your job title");
                     preparedStatement.setString(5, input.next());
                     System.out.println("enter your salary in toman ");
                     preparedStatement.setLong(6, input.nextInt());
                     System.out.println("enter your work experience in years ");
                     preparedStatement.setLong(7, input.nextInt());
                 preparedStatement.executeUpdate();
                 break;
                     case 2:
                         preparedStatement = connection.prepareStatement("delete from info where id=?");
                         System.out.println("enter your id number of user that you want to delete");
                         int temp =input.nextInt();
                         preparedStatement.setInt(1,temp);
                         preparedStatement.executeUpdate();
                         System.out.println("done");
             }
            preparedStatement.close();
                 connection.close();

        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        }
    }
}
