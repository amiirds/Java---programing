package com.ds.usc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement
            preparedStatement = connection.prepareStatement("create table student_info(id number primary key, student_code number, name varchar(30), entery_year number, avg number )");
//            preparedStatement.executeUpdate(); //sakht jadvall
            System.out.println("1-Enter data\n2-Update\n3-Delete");
            choice = input.nextInt();
            int id =0;
            switch (choice) {
                case 1:
                    preparedStatement = connection.prepareStatement("insert into student_info(id,student_code,name,entery_year,avg) values (?,?,?,?,?)");
                    System.out.print("Enter id number = ");
                    preparedStatement.setInt(1, input.nextInt());
                    System.out.print("Enter student code = ");
                    preparedStatement.setLong(2,input.nextLong());
                    System.out.print("Enter your name = ");
                    preparedStatement.setString(3, input.next());
                    System.out.print("Enter your entery year = ");
                    preparedStatement.setInt(4,input.nextInt());
                    System.out.print("Enter your average of your grade = ");
                    preparedStatement.setFloat(5,input.nextFloat());
                    preparedStatement.executeUpdate();
                    break;
                case 2:
                System.out.println("1-ID\n2-Student_Code\n3-Name\n4-Entry_year\n5-Average");
                int choose = input.nextInt();
                   switch (choose) {
                        case 1:
                            preparedStatement = connection.prepareStatement("update student_info set id=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new ID number");
                            int temp = input.nextInt();
                            preparedStatement.setLong(1, temp);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 2:
                            preparedStatement = connection.prepareStatement("update student_info set Student_code=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new student code ");
                            long temp1 = input.nextLong();
                            preparedStatement.setLong(1, temp1);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 3:
                            preparedStatement = connection.prepareStatement("update student_info set name=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new name ");
                            String temp2 = input.next();
                            preparedStatement.setString(1, temp2);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 4:
                            preparedStatement = connection.prepareStatement("update student_info set entery_year=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new Entry year ");
                            long temp3 = input.nextLong();
                            preparedStatement.setLong(1, temp3);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                        case 5:
                            preparedStatement = connection.prepareStatement("update student_info set avg=? where id=?");
                            System.out.println("whats your main ID that you want to update");
                            id = input.nextInt();
                            System.out.println("enter your new student average ");
                            float temp4 = input.nextLong();
                            preparedStatement.setFloat(1, temp4);
                            preparedStatement.setLong(2, id);
                            preparedStatement.executeUpdate();
                            System.out.println("Done");
                            break;
                       default:
                            System.out.println("invalid value");

                    }
                    break;
                case 3:
                    preparedStatement = connection.prepareStatement("delete from student_info where id=?");
                    System.out.println("Enter your id number of user that you want to delete");
                    int temp =input.nextInt();
                    preparedStatement.setInt(1,temp);
                    preparedStatement.executeUpdate();
                    System.out.println("Done");
                    break;
                default:
                    System.out.println("invalid value");
            }
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        }
    }
}
