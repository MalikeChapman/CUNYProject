//this is a work in progress, should finish it tonight, but if I don't leave it, lol

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegGUI
        extends JFrame
        implements ActionListener {

    // Components of the Form//
    private Container reg;
    private JLabel title;
    private JLabel name;
    private JTextField nameInput;
    private JLabel major;
    private JLabel gpa;
    private JTextField gpaInput;
    private JTextField majorInput;
    private JLabel level;
    private JComboBox levels;
    private JLabel email;
    private JTextField emailInput;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JLabel res;
    private JTextArea resadd;

    private String levelsNames[] = {"Freshman", "Sophomore", "Junior", "Senior"};

    // constructor, to initialize the components
    // with default values.
    public RegGUI() {

        setTitle("Student Registration");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        reg = getContentPane();
        reg.setLayout(null);

        title = new JLabel("Student Registration");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        reg.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        reg.add(name);

        nameInput = new JTextField();
        nameInput.setFont(new Font("Arial", Font.PLAIN, 15));
        nameInput.setSize(190, 20);
        nameInput.setLocation(200, 100);
        reg.add(nameInput);

        major = new JLabel("Major: ");
        major.setFont(new Font("Arial", Font.PLAIN, 20));
        major.setSize(100, 20);
        major.setLocation(100, 150);
        reg.add(major);

        majorInput = new JTextField();
        majorInput.setFont(new Font("Arial", Font.PLAIN, 15));
        majorInput.setSize(150, 20);
        majorInput.setLocation(200, 150);
        reg.add(majorInput);

        email = new JLabel("email: ");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 20);
        email.setLocation(100, 150);
        reg.add(email);

        emailInput = new JTextField();
        emailInput.setFont(new Font("Arial", Font.PLAIN, 15));
        emailInput.setSize(150, 20);
        emailInput.setLocation(200, 150);
        reg.add(emailInput);

        level = new JLabel("Current Year");
        level.setFont(new Font("Arial", Font.PLAIN, 20));
        level.setSize(100, 20);
        level.setLocation(100, 200);
        level.add(level);

        levels = new JComboBox(levelsNames);
        levels.setFont(new Font("Arial", Font.PLAIN, 15));
        levels.setSize(100, 20);
        levels.setLocation(250, 250);
        reg.add(levels);

        gpa = new JLabel("GPA: ");
        gpa.setFont(new Font("Arial", Font.PLAIN, 20));
        gpa.setSize(100, 20);
        gpa.setLocation(100, 300);
        reg.add(gpa);

        gpaInput = new JTextArea();
        gpaInput.setFont(new Font("Arial", Font.PLAIN, 15));
        gpaInput.setSize(200, 75);
        gpaInput.setLocation(200, 300);
        gpaInput.setLineWrap(true);
        reg.add(gpaInput);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        reg.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        reg.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        reg.add(reset);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        reg.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        reg.add(resadd);

        setVisible(true);
    }//finished up to this point, tbc

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + nameInput.getText() + "\n"
                        + "Mobile : "
                        + majorInput.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                        = "DOB : "
                        + (String) date.getSelectedItem()
                        + "/" + (String) month.getSelectedItem()
                        + "/" + (String) year.getSelectedItem()
                        + "\n";
                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }

if (e.getSource() == reset) {
                String def = "";
                tname.setText(def);
                tadd.setText(def);
                tmno.setText(def);
                res.setText(def);
                tout.setText(def);
                term.setSelected(false);
                date.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);
                resadd.setText(def);
            }
        }
    }
}


