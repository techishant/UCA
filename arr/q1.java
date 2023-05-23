package arr;

import java.util.Scanner;
public class q1{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 20 numbers: ");
        int arr[] = new int[20];
        int E = 0; int O = 0;
        for(int i = 0; i<20; i++){
            arr[i] = in.nextInt();
        }
        for(int i =0; i<20; i++){
            if(arr[i]%2 == 0) E += arr[i];
            else O += arr[i];
        }
        System.out.println("Sum of even Numbers: " + E);
        System.out.println("Sum of odd Numbers: " + O);
    }
}