import java.util.Scanner;
public class harshad{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int p = n;
        int s = 0; int d;
        
        while(p!=0){
            d =p%10;
            s+=d;
            p = p/10;
        }
        if(n%s == 0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number:");
        }
    }
}