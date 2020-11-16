package com.ds.usc;

import javax.swing.*;
import net.miginfocom.swing.*;

public class window extends JFrame {
    public window() {
        initComponents();
    }

    private void button1ActionPerformed() {
        new signup().setVisible(true);
    }

    private void button2ActionPerformed() {
        new Login().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        signupbtn = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("signin/signup");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- signupbtn ----
        signupbtn.setText("sign up");
        signupbtn.addActionListener(e -> button1ActionPerformed());
        contentPane.add(signupbtn, "cell 3 2");

        //---- button2 ----
        button2.setText("sign in");
        button2.addActionListener(e -> button2ActionPerformed());
        contentPane.add(button2, "cell 6 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton signupbtn;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
