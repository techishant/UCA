import java.util.Scanner;
public class Honda{
    int type, cost;
    double newCost;
    public void gettype(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter type and previous cost");
        type = in.nextInt();
        cost = in.nextInt();
    }
    public void find(){
        int rate = 0;
        if(type == 2) rate = 10;
        else if (type == 4) rate = 12;
        newCost = rate/100.0 * cost + cost;
    }
    public void printcost(){
        System.out.println("Type: " + type + "\n" + "New Cost: " + newCost);
    }
    public static void main(String[] args){
        Honda obj = new Honda();
        obj.gettype();
        obj.find();
        obj.printcost();
    }
}