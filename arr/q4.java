package arr;

import java.util.Scanner;
public class q4{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 20 numbers: ");
        int arr[] = new int[5];
        for(int i = 0; i<5; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i<5; i++){
            int c = 0;
            for(int k =2; k<arr[i]; k++){
                if(arr[i] % k == 0) {
                    c = 1; break;
                }
            }
            if(c==0) System.out.println(arr[i]);
        }
    }
}