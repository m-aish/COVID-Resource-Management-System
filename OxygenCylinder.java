import java.util.*;
class OxygenCylinder extends resource {
int O2flow;
int concentrationCapacity;
OxygenCylinder(String type) {
super(type);
O2flow = -1;
concentrationCapacity = -1;
}
OxygenCylinder(String type, int flow, int concCapacity) {
super(type);
O2flow = flow;
concentrationCapacity = concCapacity;
}
int getO2flow() {
return O2flow;
}
void setO2flow(int flow) {
O2flow = flow;
}
int getConcentrationCapacity() {
return concentrationCapacity;
}
void display(){
System.out.println("Type: "+type);
System.out.println("O2 Flow: "+O2flow);
System.out.println("Conc. Capacity: "+concentrationCapacity);
}
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Enter 1 to skip filling details, 2 to add details & then create new Oxygen Cylinder");
int choice = in.nextInt();
if(choice == 1) {
OxygenCylinder oxyCyl1 = new OxygenCylinder("cylinder");
//System.out.println(oxyCyl1.O2flow);
//System.out.println(oxyCyl1.concentrationCapacity);
oxyCyl1.display();
}
else{
System.out.println("Enter O2 flow in litres");
int temp1 = in.nextInt();
System.out.println("Enter Concentration Capacity");
int temp2 = in.nextInt();
OxygenCylinder oxyCyl1 = new OxygenCylinder("cylinder", temp1, temp2);
oxyCyl1.display();
}

}

}