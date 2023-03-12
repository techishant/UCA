import java.util.Scanner;
public class recursiveFactorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Factorial: " + fact(n));
        
    }
    
    static int fact(int n){
        if(n==1) return 1;
        else return(n*fact(n-1));
    }
}

