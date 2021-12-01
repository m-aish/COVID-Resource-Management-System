import java.util.*;
import javax.swing.*;

class Ventilator {
    int pressureVentilation;
    int tidalVolume;

    Ventilator(int pressureV, int tidalVol) {
        pressureVentilation = pressureV;
        tidalVolume = tidalVol;
    }

    Ventilator() {
        pressureVentilation = 0;
        tidalVolume = 0;
    }

    public static void displayVentilator(Ventilator v1) {
        JFrame frame = new JFrame("Ventilator Details Card");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1, l2;
        l1 = new JLabel("PRESSURE VENTILATION:        " + v1.getPressureVentilation());
        l2 = new JLabel("TIDAL VOLUME:                  " + v1.getTidalVolume());
        l1.setBounds(50, 50, 300, 30);
        l2.setBounds(50, 50, 300, 30);
        frame.add(l1);
        frame.add(l2);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void displayVentilators(Ventilator[] v1) {
        int n = 20;
        JFrame frame = new JFrame("Ventilator Directory");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 0; i < v1.length; i++) {
            JLabel l1, l2, l3;
            l3 = new JLabel("Ventilator Number: " + (i + 1));
            l1 = new JLabel("PRESSURE VENTILATION:        " + v1[i].getPressureVentilation());
            l2 = new JLabel("TIDAL VOLUME:                  " + v1[i].getTidalVolume());
            l3.setBounds(50, n, 300, 30);
            l1.setBounds(50, n + 20, 300, 30);
            l2.setBounds(50, n + 40, 300, 30);
            frame.add(l3);
            frame.add(l1);
            frame.add(l2);
            n = n + 60;
        }
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    int getPressureVentilation() {
        return pressureVentilation;
    }

    int getTidalVolume() {
        return tidalVolume;
    }

    void setPressureVentilation(int n) {
        pressureVentilation = n;
    }

    void setTidalVolume(int n) {
        tidalVolume = n;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to add one Ventilator, 2 to add multiple ventilators");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("Enter 1 to skip filling details, 2 to add details & then create new Ventilator");
            int choice2 = in.nextInt();
            if (choice2 == 1) {
                Ventilator v1 = new Ventilator();
                displayVentilator(v1);
            } else {
                System.out.println("Enter Pressure Ventilation");
                int press = in.nextInt();
                System.out.println("Enter Tidal Volume");
                int tVolume = in.nextInt();
                Ventilator v1 = new Ventilator(press, tVolume);
                displayVentilator(v1);
            }
        } else if (choice == 2) {
            ArrayList<Ventilator> vArrayList = new ArrayList<>();
            System.out.println("Enter number of ventilators to add: ");
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Enter 1 to skip filling details, 2 to add details & then create new Ventilator");
                int choice2 = in.nextInt();
                if (choice2 == 1) {
                    Ventilator v1 = new Ventilator();
                    vArrayList.add(v1);
                } else {
                    System.out.println("Enter Pressure Ventilation");
                    int press = in.nextInt();
                    System.out.println("Enter Tidal Volume");
                    int tVolume = in.nextInt();
                    Ventilator v1 = new Ventilator(press, tVolume);
                    vArrayList.add(v1);
                }
            }
            Ventilator[] vArray = vArrayList.toArray(new Ventilator[vArrayList.size()]);  
            displayVentilators(vArray);
        }
    }
}