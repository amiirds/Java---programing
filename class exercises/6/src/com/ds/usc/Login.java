

package com.ds.usc;

import javax.swing.*;
import net.miginfocom.swing.*;

import java.sql.*;

public class Login extends JFrame {
    public Login() {
        initComponents();
    }


    private void sendbtnActionPerformed() {
        int flag = 1;
        try (

                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                        "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement;
//            preparedStatement = connection.prepareStatement("create table information(fullname varchar(30) , email varchar(30)  ,password varchar(40)  , username varchar(30))");
//            preparedStatement.executeUpdate(); //sakht jadval
            preparedStatement = connection.prepareStatement("insert into information (fullname,email,password,username) values (?,?,?,?)");
            preparedStatement.setString(1, "amirreza delavaran");
            preparedStatement.setString(2, "amiirds@gmail.com");
            preparedStatement.setString(3, " amir12");
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
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from information");
            while (resultSet.next()){
                if (resultSet.getString(4).equals(textField1.getText()) && resultSet.getString(3).equals(passwordField1.getText())){
                    flag = 0;
                    break;
                }
            }
            if (flag==0){
                label2.setText("allset");
            }
            else JOptionPane.showMessageDialog(null,"invalid values\ntry again","Wrong",JOptionPane.WARNING_MESSAGE);
        } catch (
                SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label2 = new JLabel();
        userlbl = new JLabel();
        textField1 = new JTextField();
        passwordlbl = new JLabel();
        passwordField1 = new JPasswordField();
        button1 = new JButton();

        //======== this ========
        setTitle("login");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[104,fill]" +
            "[fill]" +
            "[44,fill]" +
            "[50,fill]" +
            "[42,fill]" +
            "[fill]" +
            "[0,fill]" +
            "[0,fill]",
            // rows
            "[]" +
            "[15]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[34]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        contentPane.add(label2, "cell 2 0 2 5");

        //---- userlbl ----
        userlbl.setText("Username :");
        contentPane.add(userlbl, "cell 0 6 2 4");
        contentPane.add(textField1, "cell 2 7 3 1,aligny bottom,grow 100 0");

        //---- passwordlbl ----
        passwordlbl.setText("password :");
        contentPane.add(passwordlbl, "cell 0 11 2 6");
        contentPane.add(passwordField1, "cell 2 13 3 1");

        //---- button1 ----
        button1.setText("login");
        button1.addActionListener(e -> sendbtnActionPerformed());
        contentPane.add(button1, "cell 0 17");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label2;
    private JLabel userlbl;
    private JTextField textField1;
    private JLabel passwordlbl;
    private JPasswordField passwordField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
