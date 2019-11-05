import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

class RegGUI extends JFrame {

    private Container reg;
    private JLabel heading;
    private JLabel name;
    private JTextField nameInput;
    private JLabel major;
    private JLabel gpa;
    private JTextField gpaInput;
    private JTextField majorInput;
    private JLabel level;
    private JLabel password;
    private JPasswordField passwordInput;
    private JComboBox<String> levels;
    private JLabel email;
    private JTextField emailInput;
    private JCheckBox term;
    private JButton sub;
    private static int length = 0;
    private ArrayList<Integer> students;
    // private JButton reset;
    // private JLabel res;
    // private JTextArea resadd;

    private String levelsNames[] = {"Freshman", "Sophomore", "Junior", "Senior"};

    public RegGUI() {

        setTitle("Student Registration");
        setSize(300, 400);
        setLocation(420, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        reg = getContentPane();
        reg.setLayout(null);

        heading = new JLabel("Student Registration");
        heading.setFont(new Font("Arial", Font.PLAIN, 16));
        heading.setSize(250, 30);
        heading.setLocation(60, 20);
        reg.add(heading);

        name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setSize(120, 20);
        name.setLocation(30, 100);
        reg.add(name);

        nameInput = new JTextField();
        nameInput.setFont(new Font("Arial", Font.PLAIN, 12));
        nameInput.setSize(150, 20);
        nameInput.setLocation(110, 100);
        reg.add(nameInput);

        major = new JLabel("Major: ");
        major.setFont(new Font("Arial", Font.PLAIN, 12));
        major.setSize(120, 20);
        major.setLocation(30, 120);
        reg.add(major);

        majorInput = new JTextField();
        majorInput.setFont(new Font("Arial", Font.PLAIN, 12));
        majorInput.setSize(150, 20);
        majorInput.setLocation(110, 120);
        reg.add(majorInput);

        email = new JLabel("Email: ");
        email.setFont(new Font("Arial", Font.PLAIN, 12));
        email.setSize(120, 20);
        email.setLocation(30, 140);
        reg.add(email);

        emailInput = new JTextField();
        emailInput.setFont(new Font("Arial", Font.PLAIN, 12));
        emailInput.setSize(150, 20);
        emailInput.setLocation(110, 140);
        reg.add(emailInput);

        level = new JLabel("Current Year: ");
        level.setFont(new Font("Arial", Font.PLAIN, 12));
        level.setSize(120, 20);
        level.setLocation(30, 160);
        reg.add(level);


        levels = new JComboBox<String>(levelsNames);
        levels.setFont(new Font("Arial", Font.PLAIN, 12));
        levels.setSize(100, 20);
        levels.setLocation(110, 160);
        reg.add(levels);


        gpa = new JLabel("GPA: ");
        gpa.setFont(new Font("Arial", Font.PLAIN, 12));
        gpa.setSize(120, 20);
        gpa.setLocation(30, 180);
        reg.add(gpa);

        gpaInput = new JFormattedTextField();
        gpaInput.setFont(new Font("Arial", Font.PLAIN, 12));
        gpaInput.setSize(150, 20);
        gpaInput.setLocation(110, 180);
        reg.add(gpaInput);

        password = new JLabel("Password: ");
        password.setFont(new Font("Arial", Font.PLAIN, 12));
        password.setSize(120, 20);
        password.setLocation(30, 200);
        reg.add(password);

        passwordInput = new JPasswordField();
        passwordInput.setFont(new Font("Arial", Font.PLAIN, 12));
        passwordInput.setSize(150, 20);
        passwordInput.setLocation(110, 200);
        passwordInput.setEchoChar('*');
        reg.add(passwordInput);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 12));
        term.setSize(250, 20);
        term.setLocation(60, 240);
        reg.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 12));
        sub.setSize(100, 20);
        sub.setLocation(90, 280);
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                subActionPerformed(e);
                System.exit(0);
            }

            ;
        });
        reg.add(sub);

        setVisible(true);
    }

    @SuppressWarnings("deprecation")
    private void subActionPerformed(ActionEvent e) {
        students = new ArrayList<Integer>();
        students.add(length);
        students.get(length) = new QueensStudent();
        if (term.isSelected()) {
            // students.get(length).setName = nameInput.getText();
            //students.get(length).StudentGPA = gpaInput.getText();
            //students.get(length).StudentYear = (String) levels.getSelectedItem();
            //students.get(length).StudentMajor = majorInput.getText();
            students.get(length).setPassword(passwordInput.getText());
            students.get(length).setEmail(emailInput.getText());
            length++;
        } else {
            throw new IllegalArgumentException("Please Agree to terms!");
        }
    }

}
