import java.util.Scanner;
public class equable{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int p = a+b+c;
        double s = p/2.0;
        double area = Math.sqrt(s*(s-a) * (s-b) * (s-c));
        if(area==p){
            System.out.println("Equable Triangle");
        }else{
            System.out.println("Non Equable Triangle");
        }
    }
}