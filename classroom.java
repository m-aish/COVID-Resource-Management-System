import java.util.*;
class classroom  {
public static List<Student> students = new ArrayList<>();
boolean whiteBoard;
boolean blackBoard;
boolean projector;
classroom(List<Student> students, boolean white, boolean black, boolean projector){
students = students;
whiteBoard = white;
blackBoard = black;
}
 
List<Student> getStudents(){
return students;
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of students to add: ");
int n = sc.nextInt();
for(int i = 0; i < n; i++) {
System.out.println("Enter details for Student "+(i+1));
System.out.println("Enter Name");
String temp1 = sc.next();
System.out.println("Enter Year of Study");
int temp2 = sc.nextInt();
System.out.println("Enter Gender (F/M)");
String temp3 = sc.next();
Student v1 = new Student(temp1, temp2, temp3);
students.add(v1);
System.out.println(v1+" added successfully!");
System.out.println("\n");
}
System.out.println("Name\t\tYear\tGender");
for(int i=0;i<n;i++){
//System.out.println(classroom.students.get(i));
System.out.print(students.get(i).name+"\t\t");
System.out.print(students.get(i).year+"\t");
System.out.println(students.get(i).gender);
}
}
}