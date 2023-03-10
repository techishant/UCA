import java.util.Scanner;
public class magic{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int s = n; int d, p;
        
        while(s>9){
            p = s; s= 0;
            while (p!=0){
                d = p%10;
                s += d;
                p = p/10;
            }
        }
        
        if(s==1){
            System.out.println("Magic Number");
        }else{
            System.out.println("Not a Magic Number");            
        }
    }
}