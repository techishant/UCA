package str;

import java.util.Scanner;
public class q6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = in.next();
        for(int i = 0; i<str.length(); i++){
            System.out.println("ASCII code of " + str.charAt(i) + " = " + (int)str.charAt(i)); 
        }
    }
}