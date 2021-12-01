import javax.swing.*;
class Bed
{
float bedLength;
float bedBreadth;
float getBedLength()
{
return bedLength;
}
void setBedLength(float n)
{
bedLength = n;
}
float getBedBreadth()
{
return bedBreadth;
}
void setBedBreadth(float n)
{
bedBreadth = n;
}
Bed(float l, float b){
System.out.println("Super class constructor called");
bedLength=l;
bedBreadth=b;
}
JFrame display(){
JFrame frame = new JFrame("Bed Details");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l1, l2;
l1 = new JLabel("Bed Length: "+bedLength);
l2 = new JLabel("Bed Breadth: "+bedBreadth);
l1.setBounds(50, 50, 300, 30);
l2.setBounds(50, 100, 300, 30);
frame.add(l1);
frame.add(l2);
frame.setSize(300, 300);
frame.setLayout(null);
return frame;
}
}