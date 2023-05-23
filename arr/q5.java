package arr;

import java.util.Scanner; 
public class q5{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int N = in.nextInt();
        
        String names[] = new String[N];
        double totalmarks[] = new double[N];
        System.out.println("Enter name and the total marks: ");
        int sum = 0;
        for(int i = 0; i<N; i++){
            names[i] = in.next();
            totalmarks[i] = in.nextDouble();
            sum += totalmarks[i];
        }
        double avg = sum/N;
        System.out.println("Average: " + avg);
        System.out.println("Deviations: ");
        for(int i = 0; i<N; i++){
            System.out.println(totalmarks[i] - avg);
        }
    }
}