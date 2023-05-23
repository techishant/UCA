package arr;

import java.util.Scanner;
public class q2{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 20 temperatures: ");
        double temp[] = new double[20];
        for(int i = 0; i<20; i++){
            temp[i] = in.nextDouble();
        }
        for(int i = 0; i<20; i++){
            temp[i] = 5*((temp[i]-32)/9);
            System.out.println(temp[i] + ", ");
        }
    }
}