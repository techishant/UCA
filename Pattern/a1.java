package Pattern;
public class a1{
    public static void main(int n){
        double sum = 0.0; int f = 1; int j = 0;
        for(int i = 1; i<=n; i+=2){
            j++;
            f = 1;
            for(int k = 1; k<=j; k++){
                f*=k;
            }
            sum += (double)i/f;
        }
        System.out.println("Sum: " + sum);
    }
}