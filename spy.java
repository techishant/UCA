import java.util.Scanner;
public class spy{
    public void Spy(int n){
        int p = 1; int s = 0; int d; int Q = n;
        while(n!=0){
            d = n%10;
            p*=d;
            s+=d;
            n = n/10;
        }
        if(s==p) System.out.println(Q + " is a spy number"); 
        else System.out.println(Q + " is not a spy number");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        spy A = new spy();A.Spy(n);
    }
}

