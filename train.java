import java.util.Scanner;
public class train{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the velocities of the train: ");
        double v1 = in.nextDouble();
        double v2 = in.nextDouble();
        System.out.println("Enter the lengths of the trian: ");
        double l1 = in.nextDouble();
        double l2 = in.nextDouble();
        System.out.println("Choose an option:\n1. same direction\n2. diffrent direction");
        int ch = in.nextInt();
        double d = l1+l2; double rv; double t;
        switch(ch){
            case 1:
                rv = Math.abs(v1-v2);
                t = (double)d/rv;
                System.out.println("Relative Velocity: " + rv + " m/s");
                System.out.println("Time taken: " + t + " s");
                break;
            case 2:
                rv = v1+v2;
                t = (double)d/rv;                
                System.out.println("Relative Velocity: " + rv + " m/s");
                System.out.println("Time taken: " + t  + " s");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}