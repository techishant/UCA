import java.util.Scanner;
public class multipleHarshad{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int s = 0; int d;
        int p = n;
        
        while(p>9){
            s = 0;
            while(p!=0){
                d = p%10;
                s += d;
                p = p/10;
            }
            if(n%s != 0){
                System.out.println("Hence, Not a harshad number");
                System.exit(0);
            }
            p = n/s;
            n = p;
        }
        System.out.println("Hence, a Harshad Number");
    }
}