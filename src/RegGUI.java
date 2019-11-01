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
        private JRadioButton freshman;
        private JRadioButton sophomore;
        private JRadioButton junior;
        private JRadioButton senior;
        private ButtonGroup levels;
        private JLabel email;
        private JTextField emailInput;
        private JCheckBox term;
        private JButton sub;
        private JButton reset;
        private JLabel res;
        private JTextArea resadd;

    // constructor, to initialize the components
    // with default values.
        public RegGUI(){

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

    name = new JLabel("Name: ");
    name.setFont(new Font("Arial", Font.PLAIN, 20));
    name.setSize(100, 20);
    name.setLocation(100, 150);
    reg.add(name);

    nameInput = new JTextField();
    nameInput.setFont(new Font("Arial", Font.PLAIN, 15));
    nameInput.setSize(150, 20);
    nameInput.setLocation(200, 150);
    reg.add(nameInput);

    level = new JLabel("Current Year");
    level.setFont(new Font("Arial", Font.PLAIN, 20));
    level.setSize(100, 20);
    level.setLocation(100, 200);
    level.add(level);

    freshman = new JRadioButton("Freshman");
    freshman.setFont(new Font("Arial", Font.PLAIN, 15));
    freshman.setSelected(true);
    freshman.setSize(75, 20);
    freshman.setLocation(200, 200);
    reg.add(male);

    sophomore = new JRadioButton("Sophomore");
    sophomore.setFont(new Font("Arial", Font.PLAIN, 15));
    sophomore.setSelected(false);
    sophomore.setSize(80, 20);
    sophomore.setLocation(275, 200);
    reg.add(sophomore);

    junior = new JRadioButton("Junior");
    junior.setFont(new Font("Arial", Font.PLAIN, 15));
    junior.setSelected(false);
    junior.setSize(120, 20);
    junior.setLocation(275, 200);
    reg.add(junior);

    senior = new JRadioButton("Senior");
    senior.setFont(new Font("Arial", Font.PLAIN, 15));
    senior.setSelected(false);
    senior.setSize(140, 20);
    senior.setLocation(275, 200);
    reg.add(senior);

            gengp = new ButtonGroup();
            gengp.add(male);
            gengp.add(female);
      
            dob = new JLabel("DOB");
            dob.setFont(new Font("Arial", Font.PLAIN, 20));
            dob.setSize(100, 20);
            dob.setLocation(100, 250);
            c.add(dob);
      
            date = new JComboBox(dates);
            date.setFont(new Font("Arial", Font.PLAIN, 15));
            date.setSize(50, 20);
            date.setLocation(200, 250);
            c.add(date);
      
            month = new JComboBox(months);
            month.setFont(new Font("Arial", Font.PLAIN, 15));
            month.setSize(60, 20);
            month.setLocation(250, 250);
            c.add(month);
      
            year = new JComboBox(years);
            year.setFont(new Font("Arial", Font.PLAIN, 15));
            year.setSize(60, 20);
            year.setLocation(320, 250);
            c.add(year);
      
            add = new JLabel("Address");
            add.setFont(new Font("Arial", Font.PLAIN, 20));
            add.setSize(100, 20);
            add.setLocation(100, 300);
            c.add(add);
      
            tadd = new JTextArea();
            tadd.setFont(new Font("Arial", Font.PLAIN, 15));
            tadd.setSize(200, 75);
            tadd.setLocation(200, 300);
            tadd.setLineWrap(true);
            c.add(tadd);
      
            term = new JCheckBox("Accept Terms And Conditions.");
            term.setFont(new Font("Arial", Font.PLAIN, 15));
            term.setSize(250, 20);
            term.setLocation(150, 400);
            c.add(term);
      
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 450);
            sub.addActionListener(this);
            c.add(sub);
      
            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(270, 450);
            reset.addActionListener(this);
            c.add(reset);
      
            tout = new JTextArea();
            tout.setFont(new Font("Arial", Font.PLAIN, 15));
            tout.setSize(300, 400);
            tout.setLocation(500, 100);
            tout.setLineWrap(true);
            tout.setEditable(false);
            c.add(tout);
      
            res = new JLabel("");
            res.setFont(new Font("Arial", Font.PLAIN, 20));
            res.setSize(500, 25);
            res.setLocation(100, 500);
            c.add(res);
      
            resadd = new JTextArea();
            resadd.setFont(new Font("Arial", Font.PLAIN, 15));
            resadd.setSize(200, 75);
            resadd.setLocation(580, 175);
            resadd.setLineWrap(true);
            c.add(resadd);
      
            setVisible(true);
    }
  
            // method actionPerformed()
            // to get the action performed
            // by the user and act accordingly
            public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
  
                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                                                    + " terms & conditions..");
            }
        }
  
        else if (e.getSource() == reset) {
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
  
// Driver Code
class Registration {
  
            public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}
