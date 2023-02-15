import java.util.Scanner;
public class volume{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 volume of cube, 2 for sphere and 3 for cuboid: ");
        int ch = in.nextInt();
        double vol = 0.0;
        
        switch(ch){
            case 1:
                System.out.println("Enter side of the cube: ");
                double s = in.nextDouble();
                vol = s*s*s;
                System.out.println("Volume: " + vol);
                break;
            case 2:
                System.out.println("Enter radius of the sphere: ");
                double r = in.nextDouble();
                double pi = 22/7.0;
                vol = 4/3.0 * pi * r * r * r;
                System.out.println("Volume: " + vol);
                break;
            case 3:
                System.out.println("Enter length, breadth, and height");
                double l = in.nextDouble();
                double b = in.nextDouble();
                double h = in.nextDouble();
                vol = l*b*h;
                System.out.println("Volume: " + vol);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}