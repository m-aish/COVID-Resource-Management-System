import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
 
class Login extends JFrame implements ActionListener  
{  
    JButton b1, b2;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
     
    Login()  
    {  
        userLabel = new JLabel();  
        userLabel.setText("Username");                
        textField1 = new JTextField(15);    
 
        passLabel = new JLabel();  
        passLabel.setText("Password");    
        textField2 = new JPasswordField(15);      
         
        b1 = new JButton("LOG IN");  
        b2 = new JButton("SIGN UP");

        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);    
        newPanel.add(textField1);  
        newPanel.add(passLabel);      
        newPanel.add(textField2);    
        newPanel.add(b1);                    
    newPanel.add(b2);
        add(newPanel, BorderLayout.CENTER);  
         
         
        b1.addActionListener(this);
b2.addActionListener(this);      
        setTitle("LOGIN FORM");          
    }  
     
       
    public void actionPerformed(ActionEvent ae)      
    {  
System.out.println(ae.getSource());
        if(ae.getSource() == b1){
String userValue = textField1.getText();          
        String passValue = textField2.getText();                  
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {  
             
            //create instance of the NewPage  
            NewPage page = new NewPage();  
             
            //make page visible to the user  
            page.setVisible(true);  
             
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+userValue);  
            page.getContentPane().add(wel_label);  
        }  
        else{  
            //show error message  
            System.out.println("Please enter valid username and password");  
        }  
}
else{
User1 user12 = new User1();
user12.setVisible(true);
}
    }  

    public static void main(String arg[])  
    {  
        try  
        {  
            //create instance of the CreateLoginForm  
            Login form = new Login();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {    
            //handle exception  
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
}  
}
