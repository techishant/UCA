package Pattern;
public class c3_8{
    public static void main(int a){
        double sum = 0.0;
        for(int i = 2; i<= 20; i+=3){
            sum += (double) a / i;
        }
        System.out.println("Sum: " + sum);
    }
}