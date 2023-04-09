import java.util.Scanner;
public class Loan{
    int time;
    double principal;
    double rate;
    double interest; 
    double amt;
    public void getdata(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal, rate and time");
        principal = in.nextDouble();
        rate = in.nextDouble();
        time = in.nextInt();
    }
    public void calculate(){
        interest = principal * rate * time /100.0;
        amt = principal + interest;
    }
    public void display(){
        System.out.println("Interest: " + interest);
        System.out.println("Amount: " + amt);
    }
    public static void main(String[] args){
        Loan obj = new Loan();
        obj.getdata();
        obj.calculate();
        obj.display();
    }
}