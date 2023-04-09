package pattern;
public class c1{
    public static void main(int a, int n){
        double sum = 0.0; int f = 1; 
        for(int i = 1; i<=n; i++){
            f =1;
            for(int j =1; j<=i; j++){
                f*=j;
            }
            if(i%2!=0){
                sum += (double)a/f;
            }else{
                sum -= (double)a/f;
            }
        }
        System.out.println("Sum: " + sum);
    }
}

