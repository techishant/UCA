package str;

import java.util.Scanner;
public class q10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = in.nextLine();
        int x = str.lastIndexOf(" ");
        int y = str.indexOf(" ");
        System.out.println(str.substring(x + 1) + str.substring(y, x+1) + str.substring(0, y));
    }
}