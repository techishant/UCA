package str;

import java.util.Scanner;
public class q13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = in.next();
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.print((char)(ch+1));
            }else{
                System.out.print(ch);
            }
        }
    }
}