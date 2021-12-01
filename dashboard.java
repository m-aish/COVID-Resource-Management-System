import java.io.*;

class dashboard implements Runnable {
  Thread t;
  Thread t1;
  public dashboard() {
    t = new Thread(this);
    t1 = new Thread(this);
    t.start();
    t1.start();
  }

  public void run()

  {
    try {
      if (checkVaccines())
        System.out.println("Vaccine(s) available!");
      else
        System.out.println("No Vaccines are available");
    } catch (Exception err) {
      System.out.println(err);
    }
    try {
    if (checkBeds())
      System.out.println("Bed(s) available!");
    else
      System.out.println("No Beds are available");
    }
    catch (Exception err) {
      System.out.println(err);
    }
  }

  public boolean checkVaccines() throws Exception {
    File file = new File("hospitals.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;

    while ((st = br.readLine()) != null) {
      String vacc = st.substring(st.lastIndexOf("|") + 1);
      int vaccineCount = Integer.parseInt(vacc);
      System.out.println(vaccineCount);
      if (vaccineCount > 0) {
        return true;
      }
    }
    return false;

  }

  public boolean checkBeds() throws Exception {
    File file = new File("hospitals.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;

    while ((st = br.readLine()) != null) {
      String bcountar[] = st.split("\\|");
      String bcount = bcountar[1];
      int bedCount = Integer.parseInt(bcount);
      System.out.println(bcount);
      if (bedCount > 0) {
        return true;
      }
    }
    return false;

  }

  public static void main(String[] args) {
    dashboard v1 = new dashboard();
  }

}
/* 
Overview of Java: OOP Concepts
Synopsis/Description: Functionalities of app elaborated - no tech terms
System Requirements: /for running app (same as dev)
Class Diagram - "Dia" class name, member vars, METHODS & RELATIONSHIPS
Packages Used & purpose
Classes Used, member vars & method signatures
Source Code ?!
Output => Integrate Demo? descriptions for redirects
Conclusion & Future Enhancement
References => Textbook, Internet
! White binding => title, names and reg nums, emblem and college name
DT - text formatting
*/

