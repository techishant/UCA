import java.util.Scanner;
public class Discount{
    int cost;
    String name;
    double dc;
    double amt;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter cost and name");
        cost = in.nextInt();
        name = in.next();
    }
    public void cal(){
        if(cost<=5000) dc = 0;
        else if(cost<=10000) dc = 10;
        else if(cost<=15000) dc = 15;
        else dc = 20;
        amt = cost - dc/100.0 * cost;
    }
    public void display(){
        System.out.println("Name\tDiscount\tAmt");
        System.out.println(name + "\t" + (dc*cost/100.0) + "\t" + amt);
    }
    public static void main(String[] args){
        Discount obj = new Discount();
        obj.input();
        obj.cal();
        obj.display();
    }
}