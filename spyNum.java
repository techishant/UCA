import java.util.Scanner;
public class spyNum{
    public int Spy(int n){
        int p = 1; int s = 0; int d;
        while(n!=0){
            d = n%10;
            p*=d;
            s+=d;
            n = n/10;
        }
        if(s==p) return 1; 
        else return 0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        spyNum A = new spyNum();
        int k = A.Spy(n);
        if(k == 1) System.out.println(n + " is a spy number");
        else System.out.println(n + " is not a spy number");
    }
}

