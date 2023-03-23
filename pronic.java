import java.util.Scanner;
public class pronic{
    public void Pronic(int n){
        for(int i = 1; i<=n; i++){
            if(i*(i+1) == n) {
                System.out.println(n + " is a pronic number");
                return;
            }
        }
        System.out.println(n + " not a pronic number");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: " );
        int n = in.nextInt();
        pronic A = new pronic();
        A.Pronic(n);
    }
}

