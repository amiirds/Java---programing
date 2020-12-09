import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class Form {
    public Form(int i) {
        initComponents();
        switch (i) {
            case 1:
                inputDialog.setVisible(true);
                break;
            case 2:
                int i2 = 0;
                try {
                    i2 = Service.getInstance().report().size();
                } catch (Exception ex) {
                    System.out.println("failed to report " + ex.getMessage());
                }
                try {
                    String s = "";
                    for (int i3=0 ; i3<i2 ; i3++) {
                        s = nameLabel.getText();
                        nameLabel.setText(s + "<br/>" + Service.getInstance().report().get(i3).getName());
                        s = melliLabel.getText();
                        melliLabel.setText(s + "<br/>" + Service.getInstance().report().get(i3).getMelli());
                    }
                    s = nameLabel.getText();
                    nameLabel.setText("<html>" + s + "</html>");
                    s = melliLabel.getText();
                    melliLabel.setText("<html>" + s + "</html>");
                } catch (Exception ex) {
                    System.out.println("failed to report " + ex.getMessage());
                }
                outputDialog.setVisible(true);
                break;
        }
    }
    private void nameFieldMouseClicked(MouseEvent e) {
        nameField.setText("");
    }
    private void melliFieldMouseClicked(MouseEvent e) {
        melliField.setText("");
    }
    private void ButtonMouseClicked(MouseEvent e) {
        if (nameField.getText().equals("") || nameField.getText().equals("Enter Full Name")) {
            JOptionPane.showMessageDialog(null,"Name can't be empty","Error",2);
        }
        else if (melliField.getText().equals("") || melliField.getText().equals("Enter Melli ID")) {
            JOptionPane.showMessageDialog(null,"melli id can't be empty","Error",2);

        }
        else {
            try {
                Service.getInstance().save(new Entity().setName(nameField.getText()).setMelli(melliField.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"failed to save " + ex.getMessage(),"Error",2);
            }

            JOptionPane.showMessageDialog(null,"Successful","success",1);

        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        inputDialog = new JFrame();
        label3 = new JLabel();
        nameField = new JTextField();
        label4 = new JLabel();
        melliField = new JTextField();
        Button = new JButton();
        outputDialog = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        nameLabel = new JLabel();
        melliLabel = new JLabel();

        //======== inputDialog ========
        {
            inputDialog.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            inputDialog.setTitle("Input");
            var inputDialogContentPane = inputDialog.getContentPane();
            inputDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[77,fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- label3 ----
            label3.setText("NAME");
            inputDialogContentPane.add(label3, "cell 0 0");

            //---- nameField ----
            nameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nameFieldMouseClicked(e);
                }
            });
            inputDialogContentPane.add(nameField, "cell 1 0");

            //---- label4 ----
            label4.setText("MELLI CODE");
            inputDialogContentPane.add(label4, "cell 0 1");

            //---- melliField ----
            melliField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    melliFieldMouseClicked(e);
                }
            });
            inputDialogContentPane.add(melliField, "cell 1 1");

            //---- Button ----
            Button.setText("Done");
            Button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ButtonMouseClicked(e);
                }
            });
            inputDialogContentPane.add(Button, "cell 0 2 2 1");
            inputDialog.setSize(265, 200);
            inputDialog.setLocationRelativeTo(null);
        }

        //======== outputDialog ========
        {
            outputDialog.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            outputDialog.setTitle("Database");
            var outputDialogContentPane = outputDialog.getContentPane();
            outputDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[85,fill]" +
                "[fill]",
                // rows
                "[30]" +
                "[72]"));

            //---- label1 ----
            label1.setText("Name");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 2f));
            outputDialogContentPane.add(label1, "cell 0 0,alignx center,growx 0");

            //---- label2 ----
            label2.setText("Mellicode");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 2f));
            outputDialogContentPane.add(label2, "cell 1 0,alignx center,growx 0");

            //---- nameLabel ----
            nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
            outputDialogContentPane.add(nameLabel, "cell 0 1");

            //---- melliLabel ----
            melliLabel.setHorizontalAlignment(SwingConstants.CENTER);
            outputDialogContentPane.add(melliLabel, "cell 1 1");
            outputDialog.setSize(260, 155);
            outputDialog.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JFrame inputDialog;
    private JLabel label3;
    private JTextField nameField;
    private JLabel label4;
    private JTextField melliField;
    private JButton Button;
    private JFrame outputDialog;
    private JLabel label1;
    private JLabel label2;
    private JLabel nameLabel;
    private JLabel melliLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
