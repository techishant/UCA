import java.util.Scanner;
public class nivenNum{
    public int Niven(int n){
        int P = n; int s = 0; int d;
        while(n!=0){
            d = n%10;
            s += d;
            n = n/10;
        }
        
        if(P%s == 0) return 1;
        return 0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        nivenNum A = new nivenNum();
        int k = A.Niven(n);
        if(k == 1) System.out.println(n + " is  a niven no.");
        else System.out.println(n + " is not a niven no.");
    }
}

