package Pattern;
public class e2_8{
    public static void main(int n){
        double sum =0; int p; int s;
        for(int i = 1; i<=n; i++){
            p = 1; s=0;
            for(int j = 1; j<=i; j++){
                p*=j;
                s+=j;
            }
            sum += (double)s/p;
        }
        System.out.println("Sum: " + sum);
    }
}
