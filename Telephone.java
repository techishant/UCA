import java.util.Scanner;
public class Telephone{
    int prv,pre,call;
    String name;
    double amt,total;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter previous, present readings, and name");
        prv = in.nextInt();
        pre = in.nextInt();
        name = in.next();
    }
    public void cal(){
        call = pre-prv;
        if(call<=100)       amt = 0;
        else if(call<=200)  amt = (call - 100) * 0.90;
        else if(call<=400)  amt = 100 * 0.90 + (call-200)*0.80;
        else                amt = 100 * 0.90 + 200 * 0.80 + (call-400) * 0.70; 
        total = 180 + amt;
    }
    public void display(){
        System.out.println("namet\tcalls\tamt");
        System.out.println(name+"\t"+call+"\t"+total);
    }
    public static void main(String[] args){
        Telephone obj = new Telephone();
        obj.input();
        obj.cal();
        obj.display();
    }
}