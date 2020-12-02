import java.awt.event.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public Form() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        logFrame.setVisible(true);
    }
    private void userFieldMouseClicked(MouseEvent e) {
        if (userField.getText().equals(""))
            userField.setText("");
    }
    private void passFieldMouseClicked(MouseEvent e) {
        if (passField.getText().equals(""))
            passField.setText("");
    }
    private void logSuccessButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }
    private void logButtonMouseClicked(MouseEvent e) {
        if (userField.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Username can't be empty","Error",2);

        }
        else if (passField.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"password can't be empty","Error",2);

        }
        else {
            if (Repository.users.contains(userField.getText()) == false) {
                JOptionPane.showMessageDialog(null,"User doesn't exist or wrong","Error",2);

            }
            else {
                int index = Repository.users.indexOf(userField.getText());
                String pass = Repository.passes.get(index);
                if (passField.getText().equals(pass)) {
                    JOptionPane.showMessageDialog(null,"Login successful","Succeed",1);
                }
                else {
                    JOptionPane.showMessageDialog(null,"wrong password","Error",2);

                }
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        logFrame = new JFrame();
        label1 = new JLabel();
        userField = new JTextField();
        label2 = new JLabel();
        passField = new JTextField();
        logButton = new JButton();

        //======== logFrame ========
        {
            logFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            var logFrameContentPane = logFrame.getContentPane();
            logFrameContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("username");
            logFrameContentPane.add(label1, "cell 0 0");

            //---- userField ----
            userField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    userFieldMouseClicked(e);
                }
            });
            logFrameContentPane.add(userField, "cell 2 0 3 1");

            //---- label2 ----
            label2.setText("password");
            logFrameContentPane.add(label2, "cell 0 1");

            //---- passField ----
            passField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    passFieldMouseClicked(e);
                }
            });
            logFrameContentPane.add(passField, "cell 2 1 3 1");

            //---- logButton ----
            logButton.setText("Log In");
            logButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    logButtonMouseClicked(e);
                }
            });
            logFrameContentPane.add(logButton, "cell 2 2");
            logFrame.setSize(285, 200);
            logFrame.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame logFrame;
    private JLabel label1;
    private JTextField userField;
    private JLabel label2;
    private JTextField passField;
    private JButton logButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
