import java.util.Scanner;
public class squareComputerPattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s;
        while(true){
            System.out.print("Enter a string: ");
            s=in.next();
            s = s.toUpperCase();
            if("0".equals(s)) break;
            printPattern(s);
            System.out.println("\n");
        }
    }
    
    static void printPattern(String s){
        for(int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(i));
            for(int j = 1; j<s.length()-1; j++){
                if(i==0||i==s.length()-1){
                    System.out.print(s.charAt(Math.abs(i-j)));
                    
                }
                else
                System.out.print(" ");
            }
            System.out.println(s.charAt(s.length()-i-1));
        }
    }
}

