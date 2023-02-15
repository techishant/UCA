import java.util.Scanner;
public class busCharge{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Distance: ");
        double d = in.nextDouble();
        double cost;
        
        if(d<=10){
            cost = 80;
        }else if(d<=20){
            cost = 6*d;
        }else if(d<=30){
            cost = 5*d;
        }else{
            cost = 4*d;
        }
        System.out.println("Cost : " + cost);
    }
}