import java.util.Scanner;
public class niven{
    public void Niven(int n){
        int P = n; int d; int s = 0;
        while(n!=0){
            d = n%10;
            s += d;
            n = n/10;
        }
        if(P%s == 0) System.out.println(P + " is a niven number");
        else System.out.println(P + " is not a niven number");
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        niven A = new niven();
        A.Niven(n);
    }
}

