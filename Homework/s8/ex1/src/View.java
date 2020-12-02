import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class View extends JFrame {
    public View() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
    private void nameTextMouseClicked(MouseEvent e) {

            nameText.setText("");
    }
    private void melliTextMouseClicked(MouseEvent e) {

            melliText.setText("");
    }
    private void ageTextMouseClicked(MouseEvent e) {

            ageText.setText("");
    }
    private void cityTextMouseClicked(MouseEvent e) {

            cityText.setText("");
    }
    private void specialtyTextMouseClicked(MouseEvent e) {
            specialtyText.setText("");
    }
    private void successButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }
    private void formButtonMouseClicked(MouseEvent e) {
        if (nameText.getText().equals(""))
            error("Name");
        else if (melliText.getText().equals(""))
            error("Melli Code");
        else if (ageText.getText().equals(""))
            error("Age");
        else if (cityText.getText().equals(""))
            error("City");
        else if (specialtyText.getText().equals(""))
            error("Specialty");
        else {
            try {
                Service.getInstance().save(new Entity().setId(1).setName(nameText.getText()).setMelli(melliText.getText()).setAge(Integer.parseInt(ageText.getText())).setCity(cityText.getText()).setSpec(specialtyText.getText()));
            } catch (Exception ex) {
                System.out.println("failed to save " + ex.getMessage());
            }
            form.setVisible(false);
            successDialog.setVisible(true);
        }
    }
    private void error(String s) {
        JOptionPane.showMessageDialog(null," can't be empty","Error",2);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        form = new JFrame();
        label1 = new JLabel();
        nameText = new JTextField();
        label2 = new JLabel();
        melliText = new JTextField();
        label3 = new JLabel();
        ageText = new JTextField();
        label4 = new JLabel();
        cityText = new JTextField();
        label5 = new JLabel();
        specialtyText = new JTextField();
        formButton = new JButton();
        successDialog = new JFrame();
        successText = new JLabel();
        successButton = new JButton();

        //======== form ========
        {
            form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            var formContentPane = form.getContentPane();
            formContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[140,fill]" +
                "[164,fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("Name =");
            formContentPane.add(label1, "cell 0 0");

            //---- nameText ----
            nameText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nameTextMouseClicked(e);
                }
            });
            formContentPane.add(nameText, "cell 1 0");

            //---- label2 ----
            label2.setText("Meli code =");
            formContentPane.add(label2, "cell 0 1");

            //---- melliText ----
            melliText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    melliTextMouseClicked(e);
                }
            });
            formContentPane.add(melliText, "cell 1 1");

            //---- label3 ----
            label3.setText("age");
            formContentPane.add(label3, "cell 0 2");

            //---- ageText ----
            ageText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ageTextMouseClicked(e);
                }
            });
            formContentPane.add(ageText, "cell 1 2");

            //---- label4 ----
            label4.setText("city =");
            formContentPane.add(label4, "cell 0 3");

            //---- cityText ----
            cityText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    cityTextMouseClicked(e);
                }
            });
            formContentPane.add(cityText, "cell 1 3");

            //---- label5 ----
            label5.setText("Title");
            formContentPane.add(label5, "cell 0 4");

            //---- specialtyText ----
            specialtyText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    specialtyTextMouseClicked(e);
                }
            });
            formContentPane.add(specialtyText, "cell 1 4");

            //---- formButton ----
            formButton.setText("Done");
            formButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    formButtonMouseClicked(e);
                }
            });
            formContentPane.add(formButton, "cell 1 5");
            form.setSize(360, 300);
            form.setLocationRelativeTo(null);
        }

        //======== successDialog ========
        {
            var successDialogContentPane = successDialog.getContentPane();
            successDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- successText ----
            successText.setText("All set");
            successText.setHorizontalAlignment(SwingConstants.CENTER);
            successDialogContentPane.add(successText, "cell 0 0 1 2");

            //---- successButton ----
            successButton.setText("Done");
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
    private JFrame form;
    private JLabel label1;
    private JTextField nameText;
    private JLabel label2;
    private JTextField melliText;
    private JLabel label3;
    private JTextField ageText;
    private JLabel label4;
    private JTextField cityText;
    private JLabel label5;
    private JTextField specialtyText;
    private JButton formButton;
    private JFrame successDialog;
    private JLabel successText;
    private JButton successButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
