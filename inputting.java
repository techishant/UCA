import java.util.Scanner;
public class inputting{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: " );
        int i = in.nextInt();
        in.nextLine();
        System.out.println("Enter an String: " );
        String s = in.nextLine();

        
        System.out.println("String: " + s);
        System.out.println("Integer: " + i);
    }
}