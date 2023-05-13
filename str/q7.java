package str;

import java.util.Scanner;
public class q7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence: " );
        String str = in.nextLine();
        str = str.toUpperCase();
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.print('*');
            }else{
                System.out.print(ch);
            }
        }
    }
}