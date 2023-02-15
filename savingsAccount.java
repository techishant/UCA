import java.util.Scanner;
public class savingsAccount{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Select an option: ");
        System.out.println("1. Money Deposited\n2. Money Withdrawn\n3. Check Balance\n0. To quit");
        int ch = in.nextInt();
        double bal = 20000;
        double amt;
        
        switch(ch){
            case 1:
                System.out.println("Balance: " + bal);
                System.out.println("Enter the money to be deposited: ");
                amt = in.nextDouble();
                bal+=amt;
                System.out.println("Current Balance: " + bal);
                break;
            case 2:
                System.out.println("Balance: " + bal);
                System.out.println("Enter the money to be withdraw: ");
                amt = in.nextDouble();
                bal-=amt;
                System.out.println("Current Balance: " + bal);
                break;
            case 3:
                System.out.println("Current Balance: " + bal);
                break;
            case 0:
                System.out.println("quitting..");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}