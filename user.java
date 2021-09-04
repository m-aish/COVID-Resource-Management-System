import javax.swing.*;

class User {
  String name;
  int age;
  int phoneNumber;

  boolean setName(String newName) {
    name = newName;
    return true;
  }

  String getName() {
    return name;
  }

  boolean setAge(int n) {
    age = n;
    return true;
  }

  int getAge() {
    return age;
  }

  boolean setPhoneNumber(int n) {
    phoneNumber = n;
    return true;
  }

  int getPhoneNumber() {
    return phoneNumber;
  }

  void viewHospitalMeta(int HospitalId) {
    System.out.println("Once Hospital Class is complete, this function will display all info about Hospital " + HospitalId);
  }

  JFrame displayUserInfo() {
     JFrame frame = new JFrame("User Information Card");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel l1,l2,l3;  
    l1=new JLabel("Name:     "+name);  
    l1.setBounds(50,50, 300,30);  
    l2=new JLabel("Age:      "+age);  
    l2.setBounds(50,100, 300,30);  
    l3=new JLabel("Phone Number:      "+phoneNumber);  
    l3.setBounds(50,150, 300,30);  
    frame.add(l1); 
    frame.add(l2); 
    frame.add(l3);
    frame.setSize(300,300);  
    frame.setLayout(null);  
    return frame;
  }
}

// Driver Class is as follows:
class userDemo {
  public static void main(String args[]) {
    User user1 = new User();

    // initialize user:
    user1.setName("testUser1");
    user1.setAge(50);
    user1.setPhoneNumber(1234567890);

    // display JFrame returned by displayUserInfo()
    user1.displayUserInfo().setVisible(true);

    // run other methods in User class:
    System.out.println("Name of Initialized User is " + user1.getName());
    System.out.println("Age of Initialized User is " + user1.getAge());
    System.out.println("Phone Number of Initialized User is " + user1.getPhoneNumber());
    user1.viewHospitalMeta(1234);
  }
}
