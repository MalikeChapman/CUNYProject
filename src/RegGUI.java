import javax.swing.*;
import java.awt.*;

class RegGUI extends JFrame {

    private Container reg;
    private JLabel title;
    private JLabel name;
    private JTextField nameInput;
    private JLabel major;
    private JLabel gpa;
    private JTextField gpaInput;
    private JTextField majorInput;
    private JLabel level;
    //private JComboBox levels;
    private JLabel email;
    private JTextField emailInput;
    private JCheckBox term;
    private JButton sub;
    // private JButton reset;
    // private JLabel res;
    // private JTextArea resadd;

    private String levelsNames[] = {"Freshman", "Sophomore", "Junior", "Senior"};

    public RegGUI() {

        setTitle("Student Registration");
        setSize(300, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        reg = getContentPane();
        reg.setLayout(null);

        title = new JLabel("Student Registration");
        title.setFont(new Font("Arial", Font.PLAIN, 16));
        title.setSize(60, 30);
        title.setLocation(60, 20);
        reg.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setSize(120, 20);
        name.setLocation(30, 100);
        reg.add(name);

        nameInput = new JTextField();
        nameInput.setFont(new Font("Arial", Font.PLAIN, 12));
        nameInput.setSize(150, 20);
        nameInput.setLocation(100, 100);
        reg.add(nameInput);

        major = new JLabel("Major: ");
        major.setFont(new Font("Arial", Font.PLAIN, 12));
        major.setSize(100, 20);
        major.setLocation(100, 150);
        reg.add(major);

        majorInput = new JTextField();
        majorInput.setFont(new Font("Arial", Font.PLAIN, 12));
        majorInput.setSize(150, 20);
        majorInput.setLocation(200, 150);
        reg.add(majorInput);

        email = new JLabel("email: ");
        email.setFont(new Font("Arial", Font.PLAIN, 12));
        email.setSize(100, 20);
        email.setLocation(100, 150);
        reg.add(email);

        emailInput = new JTextField();
        emailInput.setFont(new Font("Arial", Font.PLAIN, 12));
        emailInput.setSize(150, 20);
        emailInput.setLocation(200, 150);
        reg.add(emailInput);

        level = new JLabel("Current Year");
        level.setFont(new Font("Arial", Font.PLAIN, 12));
        level.setSize(100, 20);
        level.setLocation(100, 200);
        reg.add(level);

        /*
         * levels = new JComboBox(levelsNames); levels.setFont(new Font("Arial",
         * Font.PLAIN, 15)); levels.setSize(100, 20); levels.setLocation(250, 250);
         * reg.add(levels);
         */

        gpa = new JLabel("GPA: ");
        gpa.setFont(new Font("Arial", Font.PLAIN, 12));
        gpa.setSize(100, 20);
        gpa.setLocation(100, 300);
        reg.add(gpa);

        gpaInput = new JTextField();
        gpaInput.setFont(new Font("Arial", Font.PLAIN, 12));
        gpaInput.setSize(200, 75);
        gpaInput.setLocation(200, 300);
        reg.add(gpaInput);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 12));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        reg.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 12));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        reg.add(sub);

        setVisible(true);
    }

}