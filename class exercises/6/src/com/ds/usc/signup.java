

package com.ds.usc;

import javax.swing.*;
import net.miginfocom.swing.*;

import java.sql.*;


public class signup extends JFrame {
    public signup() {
        initComponents();
    }

    private void button1ActionPerformed() {

        try (

                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "amirds",
                        "ds123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement("insert into information (fullname,email,password,username) values (?,?,?,?)");
            preparedStatement.setString(1, fname.getText());
            preparedStatement.setString(2,femail.getText());
            preparedStatement.setString(4,fuser.getText());
            preparedStatement.setString(3,fpassword.getText());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null,"all set\nall data saved","DataBase",JOptionPane.INFORMATION_MESSAGE);


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
        label1 = new JLabel();
        fname = new JTextField();
        label2 = new JLabel();
        femail = new JTextField();
        label3 = new JLabel();
        fuser = new JTextField();
        label4 = new JLabel();
        fpassword = new JPasswordField();
        button1 = new JButton();

        //======== this ========
        setTitle("signup");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[85,fill]" +
            "[60,fill]" +
            "[fill]" +
            "[fill]" +
            "[56,fill]" +
            "[fill]",
            // rows
            "[31]" +
            "[30]" +
            "[38]" +
            "[36]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("FullName =");
        contentPane.add(label1, "cell 0 0");
        contentPane.add(fname, "cell 1 0 2 1");

        //---- label2 ----
        label2.setText("EmailAddress =");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(femail, "cell 1 1 2 1");

        //---- label3 ----
        label3.setText("Username =");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(fuser, "cell 1 2 2 1");

        //---- label4 ----
        label4.setText("Password =");
        contentPane.add(label4, "cell 0 3");
        contentPane.add(fpassword, "cell 1 3 2 1");

        //---- button1 ----
        button1.setText("Signup ");
        button1.addActionListener(e -> button1ActionPerformed());
        contentPane.add(button1, "cell 1 6,alignx center,growx 0");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField fname;
    private JLabel label2;
    private JTextField femail;
    private JLabel label3;
    private JTextField fuser;
    private JLabel label4;
    private JPasswordField fpassword;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
