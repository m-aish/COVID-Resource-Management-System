import java.io.*;
import java.util.*;
class Vaccine implements Serializable{
int dose;
String company;

Vaccine(int newDose, String newCompany){
dose = newDose;
company = newCompany;
}

Vaccine(String newCompany){
dose = 1;
company = newCompany;
}

int getDose(){
return dose;
}
void setDose(int doseNumber) throws InvalidVaccineException{
      if(doseNumber!=1 && doseNumber!=2)
      throw new InvalidVaccineException(doseNumber);
      else
      dose = doseNumber;
}
String getCompany(){
      return company;
}
void setCompany(String newCompany) throws InvalidVaccineException{
      if(newCompany.equalsIgnoreCase("Covaxin")==false && newCompany.equalsIgnoreCase("Covishield")==false)
      throw new InvalidVaccineException(newCompany);
      else
      company = newCompany;
}

public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Adding new vaccine to Resources");
System.out.println("Enter name of Manufacturing Company");
String company = in.next();
System.out.println("Enter 1 for first dose, 2 for second dose");
int dose = in.nextInt();

Vaccine vaccine1 = new Vaccine(1, "Covaxin");
try{
      vaccine1.setCompany(company);
      vaccine1.setDose(dose);
}
catch(InvalidVaccineException e){
      System.out.println("Exception Encountered");
      System.out.println(e);
}
if(vaccine1!=null){
try{
FileOutputStream fout = new FileOutputStream("vaccines.txt");
ObjectOutputStream out = new ObjectOutputStream(fout);
out.writeObject(vaccine1);
out.flush();
out.close();
System.out.println("Success");
}catch(Exception e){System.out.println(e);}  
      //Creating stream to read the object  
}
}
}
