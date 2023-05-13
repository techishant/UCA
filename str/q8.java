package str;
import java.util.Scanner;
public class q8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = in.nextLine(); 
        str = " " + str;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                System.out.print(str.charAt(i+1));
            }
        }
    }
}