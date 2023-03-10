import java.util.Scanner;
public class duck{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: " );
        int n = in.nextInt(); int d;
        
        while(n>0){
            d = n%10;
            if(d == 0){
                System.out.println("Duck Number");
                System.exit(0);
            }
            n = n/10;
        }
        System.out.println("Not a duck number");
    }
}