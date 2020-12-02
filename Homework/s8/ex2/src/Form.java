import java.awt.event.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public int index;
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
    private void uNameFieldMouseClicked(MouseEvent e) {
        if (uNameField.getText().equals(""))
            uNameField.setText("");
    }
    private void uUserFieldMouseClicked(MouseEvent e) {
        if (uUserField.getText().equals(""))
            uUserField.setText("");
    }
    private void uPassFieldMouseClicked(MouseEvent e) {
        if (uPassField.getText().equals(""))
            uPassField.setText("");
    }
    private void uEmailFieldMouseClicked(MouseEvent e) {
        if (uEmailField.getText().equals(""))
            uEmailField.setText("");
    }
    private void logButtonMouseClicked(MouseEvent e) {
        if (userField.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Username can't be empty","ERROR",2);

        }
        else if (passField.getText().equals("") || passField.getText().equals("Enter Password")) {
            JOptionPane.showMessageDialog(null,"password can't be empty","ERROR",2);

        }
        else {
            if (Repository.users.contains(userField.getText()) == false) {
                JOptionPane.showMessageDialog(null,"User doesn't exist","ERROR",2);

            }
            else {
                index = Repository.users.indexOf(userField.getText());
                String pass = Repository.passes.get(index);
                if (passField.getText().equals(pass)) {
                    logFrame.setVisible(false);
                    updateFrame.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null,"wrong password","ERROR",2);

                }
            }
        }
    }
    private void updateButtonMouseClicked(MouseEvent e) {
        if (uNameField.getText().equals(""))
            uNameField.setText("");
        if (uUserField.getText().equals(""))
            uUserField.setText("");
        if (uPassField.getText().equals(""))
            uPassField.setText("");
        if (uEmailField.getText().equals(""))
            uEmailField.setText("");
        String un=null, uu=null, up=null, ue=null;
        if (!uNameField.getText().equals(""))
            un = uNameField.getText();
        else try {
            un = Service.getInstance().report().get(index).getName();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uUserField.getText().equals(""))
            uu = uUserField.getText();
        else try {
            uu = Service.getInstance().report().get(index).getUsername();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uPassField.getText().equals(""))
            up = uPassField.getText();
        else try {
            up = Service.getInstance().report().get(index).getPassword();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!uEmailField.getText().equals(""))
            ue = uEmailField.getText();
        else try {
            ue = Service.getInstance().report().get(index).getEmail();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            Service.getInstance().edit(new Entity().setId(index + 1).setName(un).setUsername(uu).setPassword(up).setEmail(ue));
        } catch (Exception ex) {
            System.out.println("failed to update " + ex.getMessage());
        }
        updateFrame.setVisible(false);
        successDialog.setVisible(true);
    }
    private void successButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        logFrame = new JFrame();
        label6 = new JLabel();
        userField = new JTextField();
        label7 = new JLabel();
        passField = new JTextField();
        logButton = new JButton();
        updateFrame = new JFrame();
        label2 = new JLabel();
        uNameField = new JTextField();
        label3 = new JLabel();
        uUserField = new JTextField();
        label4 = new JLabel();
        uPassField = new JTextField();
        label5 = new JLabel();
        uEmailField = new JTextField();
        updateButton = new JButton();
        successDialog = new JDialog();
        label1 = new JLabel();
        successButton = new JButton();

        //======== logFrame ========
        {
            logFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            logFrame.setTitle("Login");
            var logFrameContentPane = logFrame.getContentPane();
            logFrameContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
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

            //---- label6 ----
            label6.setText("username");
            logFrameContentPane.add(label6, "cell 0 0 3 1");

            //---- userField ----
            userField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    userFieldMouseClicked(e);
                }
            });
            logFrameContentPane.add(userField, "cell 3 0 2 1");

            //---- label7 ----
            label7.setText("password");
            logFrameContentPane.add(label7, "cell 0 1 3 1");

            //---- passField ----
            passField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    passFieldMouseClicked(e);
                }
            });
            logFrameContentPane.add(passField, "cell 3 1 2 1");

            //---- logButton ----
            logButton.setText("Log In");
            logButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    logButtonMouseClicked(e);
                }
            });
            logFrameContentPane.add(logButton, "cell 3 2");
            logFrame.setSize(270, 200);
            logFrame.setLocationRelativeTo(null);
        }

        //======== updateFrame ========
        {
            updateFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            updateFrame.setTitle("Update");
            var updateFrameContentPane = updateFrame.getContentPane();
            updateFrameContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[114,fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label2 ----
            label2.setText("Name");
            updateFrameContentPane.add(label2, "cell 0 0");

            //---- uNameField ----
            uNameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uNameFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uNameField, "cell 1 0");

            //---- label3 ----
            label3.setText("Username");
            updateFrameContentPane.add(label3, "cell 0 1");

            //---- uUserField ----
            uUserField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uUserFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uUserField, "cell 1 1");

            //---- label4 ----
            label4.setText("password");
            updateFrameContentPane.add(label4, "cell 0 2");

            //---- uPassField ----
            uPassField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uPassFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uPassField, "cell 1 2");

            //---- label5 ----
            label5.setText("Email");
            updateFrameContentPane.add(label5, "cell 0 3");

            //---- uEmailField ----
            uEmailField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    uEmailFieldMouseClicked(e);
                }
            });
            updateFrameContentPane.add(uEmailField, "cell 1 3");

            //---- updateButton ----
            updateButton.setText("Done");
            updateButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    updateButtonMouseClicked(e);
                }
            });
            updateFrameContentPane.add(updateButton, "cell 1 4");
            updateFrame.setSize(315, 250);
            updateFrame.setLocationRelativeTo(null);
        }

        //======== successDialog ========
        {
            successDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            var successDialogContentPane = successDialog.getContentPane();
            successDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("Update Successful");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            successDialogContentPane.add(label1, "cell 0 0 1 2");

            //---- successButton ----
            successButton.setText("Close");
            successButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    successButtonMouseClicked(e);
                }
            });
            successDialogContentPane.add(successButton, "cell 0 2");
            successDialog.setSize(200, 150);
            successDialog.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame logFrame;
    private JLabel label6;
    private JTextField userField;
    private JLabel label7;
    private JTextField passField;
    private JButton logButton;
    private JFrame updateFrame;
    private JLabel label2;
    private JTextField uNameField;
    private JLabel label3;
    private JTextField uUserField;
    private JLabel label4;
    private JTextField uPassField;
    private JLabel label5;
    private JTextField uEmailField;
    private JButton updateButton;
    private JDialog successDialog;
    private JLabel label1;
    private JButton successButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
