package arr;

import java.util.Scanner;
public class q3{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int arr[] = new int[10];
        for(int i =0; i<10; i++){
            arr[i] = in.nextInt();
        }
        for(int i =0; i<10; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }
        for(int i =0; i<10; i++){
            if(arr[i] > 0){
                System.out.println(arr[i]);
            }
        }
    }
}