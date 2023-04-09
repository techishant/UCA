package Pattern;
public class d2_8{
    public static void main(int n){
        int sum =0; int p;
        for(int i = 1; i<=n; i++){
            p = 1;
            for(int j = 1; j<=i; j++){
                p*=j;
            }
            sum += p;
        }
        System.out.println("Sum: " + sum);
    }
}