import java.util.Scanner;
public class pronicNum{
    public int Pronic(int n){
        for(int i = 1; i<=n; i++){
            if(i*(i+1) == n){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        pronicNum A = new pronicNum();
        int k = A.Pronic(n);
        if(k == 1) System.out.println(n + " is a pronic number");
        else System.out.println(n + " is not a pronic number");
    }
}