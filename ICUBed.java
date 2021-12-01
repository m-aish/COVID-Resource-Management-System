import javax.swing.*;
import java.util.Scanner;
class ICUBed extends Bed {
boolean hasAttachedVentilator;
boolean hasAttachedCylinder;
boolean isPortable;
static Scanner sc = new Scanner(System.in);
ICUBed(int l, int b){
super(l, b);
System.out.println("Enter 1 if Oxygen Cylinder is attached, 0 otherwise");
int cyl = sc.nextInt();
if(cyl == 1)
hasAttachedCylinder = true;
else
hasAttachedCylinder = false;
System.out.println("Enter 1 if Ventilator is attached, 0 otherwise");
int vent = sc.nextInt();
if(vent == 1)
hasAttachedVentilator = true;
else
hasAttachedVentilator = false;
System.out.println("Enter 1 if Bed is portable, 0 otherwise");
int port = sc.nextInt();
if(port == 1)
isPortable = true;
else
isPortable= false;
}
JFrame display(){
JFrame frame = new JFrame("Bed Details");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l1, l2, l3, l4, l5;
l1 = new JLabel("Bed Length: "+bedLength);
l2 = new JLabel("Bed Breadth: "+bedBreadth);
l3 = new JLabel("Is O2 Cylinder attached? "+hasAttachedCylinder);
l4 = new JLabel("Is Ventilator attached? "+hasAttachedVentilator);
l5 = new JLabel("Is Portable? "+isPortable);
l1.setBounds(50, 20, 300, 30);
l2.setBounds(50, 40, 300, 30);
l3.setBounds(50, 60, 300, 30);
l4.setBounds(50, 80, 300, 30);
l5.setBounds(50, 100, 300, 30);
frame.add(l1);
frame.add(l2);
frame.add(l3);
frame.add(l4);
frame.add(l5);
frame.setSize(300, 300);
frame.setLayout(null);
return frame;
}
public static void main(String args[]){
 System.out.println("Enter Bed Length");
int l = sc.nextInt();
System.out.println("Enter Bed Breadth");
int b = sc.nextInt();
 ICUBed obj = new ICUBed(l, b);
 obj.display().setVisible(true);
}
}