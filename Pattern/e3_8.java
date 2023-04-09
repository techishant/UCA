package Pattern;
public class e3_8{
    public static void main(int a, int n){
        int k = 0; double sum = 0.0;
        for(int i = 1; i<=n; i+=2){
            k++;
            if(k%2 != 0) sum += Math.pow(a,i);
            else sum -= Math.pow(a,i);
        }
        System.out.println("Sum: " + sum);
    }
}