package Pattern;

public class b2_8{
    public static void main(int n){
        int k = 0; int sum = 0;
        for(int i = 2; i<=n; i+=2){
            k++;
            if(k%2 != 0) sum += i;
            else sum -= i;
        }
        System.out.println("Sum: " + sum);
    }
}