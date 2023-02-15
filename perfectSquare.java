import java.util.Scanner;
public class perfectSquare{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        
        int p = (int) Math.sqrt(n);
        int d;
        
        if(p*p == n){
            System.out.println("Perfect Square Number");
        }else{
            System.out.println("Not a Perfect Square Number");
            d = (p+1)*(p+1) - n;
            System.out.println(d + " is to be added");
        }
    }
}