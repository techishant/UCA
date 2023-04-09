package Pattern;
public class b1{
    public static void main(int a, int n){
        int f = 1; double sum = 0.0;
        for(int i = 1; i<=n; i++){
            f = 1;
            for(int j = 1; j<=i; j++){
                f*=j;
            }
            sum += (double)a/f;
        }
        System.out.println("Sum: " + sum);
    }
}