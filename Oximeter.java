import java.util.Scanner;

public class Oximeter {
    int SPO2Range;
    int SPO2Accuracy;
    Oximeter(int SPO2R, int SPO2A){
        SPO2Range = SPO2R;
        SPO2Accuracy = SPO2A;
    }
    int getSPO2Range(){
        return SPO2Range;
    }
    int getSPO2Accuracy(){
        return SPO2Accuracy;
    }
    void setSPO2Range(int SPO2R){
        SPO2Range = SPO2R;
    }
    void setSPO2Range(){
        SPO2Range = 100;
    }
    void setSPO2Accuracy(int SPO2A){
        SPO2Accuracy = SPO2A;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SPO2 Range");
        int temp1 = sc.nextInt();
        System.out.println("Enter SPO2 Accuracy");
        int temp2 = sc.nextInt();
        Oximeter o1 = new Oximeter(temp1, temp2);
        System.out.println("Details of new Oximeter");
        System.out.println("SPO2 Range: "+o1.getSPO2Range());
        System.out.println("SPO2 Accuracy: "+o1.getSPO2Accuracy());

        System.out.println("Enter 1 to reset SPO2 Range to default (using overloaded method), 2 to change SPO2 Range");
        int choice = sc.nextInt();
        if(choice == 1){
            o1.setSPO2Range();
        }
        else if(choice == 2)
        {
            System.out.println("Enter value: ");
            int temp3 = sc.nextInt();
            o1.setSPO2Range(temp3);
        }
        else{
            System.out.println("Invalid Choice");
        }
        System.out.println("Details of new Oximeter");
        System.out.println("SPO2 Range: "+o1.getSPO2Range());
        System.out.println("SPO2 Accuracy: "+o1.getSPO2Accuracy());
    }
}
