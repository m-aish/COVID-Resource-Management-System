import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.Serializable;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class User1 extends JFrame implements ActionListener, Serializable {

  String userName;
  int phoneNumber;
  String userAddress;
  String userGender;
  String userDateOfBirth;

  private Container c;
  private JLabel title;
  private JLabel name;
  private JTextField tname;
  private JLabel mno;
  private JTextField tmno;
  private JLabel gender;
  private JRadioButton male;
  private JRadioButton female;
  private ButtonGroup gengp;
  private JLabel dob;
  private JComboBox date;
  private JComboBox month;
  private JComboBox year;
  private JLabel add;
  private JTextArea tadd;
  private JCheckBox term;
  private JButton sub;
  private JButton reset;
  private JLabel res;
  private JTextArea resadd;

  private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
      "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
  private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
  private String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
      "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" };

  User1() {
    setTitle("Registration Form");
    setBounds(300, 90, 500, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    c = getContentPane();
    c.setLayout(null);

    title = new JLabel("User Registration Form");
    title.setFont(new Font("Arial", Font.PLAIN, 25));
    title.setSize(300, 30);
    title.setLocation(30, 30);
    c.add(title);

    name = new JLabel("Name");
    name.setFont(new Font("Arial", Font.PLAIN, 15));
    name.setSize(100, 20);
    name.setLocation(100, 100);
    c.add(name);

    tname = new JTextField();
    tname.setFont(new Font("Arial", Font.PLAIN, 15));
    tname.setSize(190, 20);
    tname.setLocation(200, 100);
    c.add(tname);

    mno = new JLabel("Mobile");
    mno.setFont(new Font("Arial", Font.PLAIN, 15));
    mno.setSize(100, 20);
    mno.setLocation(100, 150);
    c.add(mno);

    tmno = new JTextField();
    tmno.setFont(new Font("Arial", Font.PLAIN, 15));
    tmno.setSize(150, 20);
    tmno.setLocation(200, 150);
    c.add(tmno);

    gender = new JLabel("Gender");
    gender.setFont(new Font("Arial", Font.PLAIN, 15));
    gender.setSize(100, 20);
    gender.setLocation(100, 200);
    c.add(gender);

    male = new JRadioButton("Male");
    male.setFont(new Font("Arial", Font.PLAIN, 15));
    male.setSelected(true);
    male.setSize(75, 20);
    male.setLocation(200, 200);
    c.add(male);

    female = new JRadioButton("Female");
    female.setFont(new Font("Arial", Font.PLAIN, 15));
    female.setSelected(false);
    female.setSize(80, 20);
    female.setLocation(275, 200);
    c.add(female);

    gengp = new ButtonGroup();
    gengp.add(male);
    gengp.add(female);

    dob = new JLabel("DOB");
    dob.setFont(new Font("Arial", Font.PLAIN, 15));
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
    add.setFont(new Font("Arial", Font.PLAIN, 15));
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

    res = new JLabel("");
    res.setFont(new Font("Arial", Font.PLAIN, 20));
    res.setSize(500, 25);
    res.setLocation(100, 500);
    c.add(res);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
        String name = tname.getText() + "|";
        try{
        boolean flag = false;
        int count = 0;
        Scanner sc1 = new Scanner(new FileInputStream("users.txt"));
        while(sc1.hasNextLine()) {
         String line = sc1.nextLine();
         if(line.indexOf(name)!=-1) {
            flag = true;
            count = count+1;
         }
      }
      if(flag) {
          res.setText("User already existed ");
          Login Login1 = new Login();
          Login1.setVisible(true);
      }
      else {
       if (term.isSelected()) {
      if (e.getSource() == sub) {
        String phoneNumber = tmno.getText() + "|";
        String gender;
        if (male.isSelected())
          gender = "Male" + "|";
        else
          gender = "Female" + "|";
        String dateOfBirth = (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/"
            + (String) year.getSelectedItem()+ "|";
        String data3 = tadd.getText()+"|";
     
     
      try {
       FileWriter fwrite = new FileWriter("users.txt", true);
      fwrite.write(name + phoneNumber + gender + dateOfBirth + data3+"\n");
         fwrite.close();
         System.out.println("Content is successfully written to the file.");
         } catch (IOException ioe) {
         System.out.print("Exception occured");
         }
      res.setText("Registration Successful");
    } else {
      res.setText("Please accept the" + " terms & conditions..");
    }
  }
  else if(e.getSource()==reset)

  {
    String def = "";
    tname.setText(def);
    tadd.setText(def);
    tmno.setText(def);
    res.setText(def);
    term.setSelected(false);
    date.setSelectedIndex(0);
    month.setSelectedIndex(0);
    year.setSelectedIndex(0);
    male.setSelected(false);
    female.setSelected(false);
  }
  }
  }
  catch(FileNotFoundException fnfe){
    System.out.println("FileNotFoundException");
  }
  }
  public static void main(String[] args) {
    User1 f = new User1();
  }
}
