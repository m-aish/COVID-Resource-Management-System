import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

class Hospital {
      static List<Vaccine> vaccines = new ArrayList<>();
      static List<OxygenCylinder> oxygenCylinders = new ArrayList<>();
      static List<Oximeter> oximeters = new ArrayList<>();
      static List<Ventilator> ventilators = new ArrayList<>();
      static List<Bed> beds = new ArrayList<>();

      Hospital(List<Vaccine> vacc, List<OxygenCylinder> oCylinders, List<Oximeter> ometers, List<Ventilator> vents,
                  List<Bed> bs) {
            vaccines = vacc;
            oxygenCylinders = oCylinders;
            oximeters = ometers;
            ventilators = vents;
            beds = bs;
      }

      List<Vaccine> getListOfVaccines() {
            return vaccines;
      }

      List<OxygenCylinder> getListOfOxygenCylinders() {
            return oxygenCylinders;
      }

      List<Oximeter> getListOfOximeters() {
            return oximeters;
      }

      List<Ventilator> getListOfVentilators() {
            return ventilators;
      }

      List<Bed> getListOfBeds() {
            return beds;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            /*
             * DESERIALIZATION
             * System.out.println("Vaccine is already available in directory"); Object try {
             * ObjectInputStream in1 = new ObjectInputStream(new
             * FileInputStream("vaccines.txt")); Vaccine s = (Vaccine) in1.readObject();
             * System.out.println("Dose of Vaccine: " + s.dose);
             * System.out.println("Company of Vaccine: " + s.company); in1.close(); } catch
             * (Exception e) { System.out.println(e); }
             */
            StringBuilder str = new StringBuilder(0);
            System.out.println("Enter name of Hospital");
            String name = sc.nextLine();
            str.append(name + '|');
            System.out.println("Enter number of Beds available");
            int beds = sc.nextInt();
            str.append(Integer.toString(beds) + '|');
            System.out.println("Enter number of active cases");
            int active = sc.nextInt();
            str.append(Integer.toString(active) + '|');
            System.out.println("Enter average age of patients");
            int avgage = sc.nextInt();
            str.append(Integer.toString(avgage) + '|');
            System.out.println("Enter number of discharged cases");
            int discharged = sc.nextInt();
            str.append(Integer.toString(discharged) + '|');
            System.out.println("Enter contact number of person in charge");
            int phone = sc.nextInt();
            str.append(Integer.toString(phone) + '|');
            System.out.println("Enter address of Hospital");
            sc.nextLine(); 
            String address = sc.nextLine();
            str.append(address + '|');
            System.out.println("Enter number of Vaccines available");
            int vacs = sc.nextInt();
            str.append(Integer.toString(vacs));
            try {
                  FileWriter fwrite = new FileWriter("C:/Users/withl/OneDrive/Desktop/College/COVID-Resource-Management-System/hospitals1.txt");
                  // fwrite.write(str.toString());
                  fwrite.write("Content is successfully wrote to the file.");
                  fwrite.close();
                  System.out.println("Content is successfully wrote to the file.");
            } catch (IOException e) {
                  System.out.print("Exception occured");
            }
      }
}