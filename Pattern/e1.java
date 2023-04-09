package Pattern;
public class e1{
    public static void main(int a, int n){
        double sum = 0.0; int l =0; int k=0;
        for(int i = 2; i<=n; i++){
            k = 0;
            for(int j = 2; j<i; j++){
                if(i%j==0) k++;
            }
            if(k==0){
                l++;
                sum += i/Math.pow(a,l);
            }
        }
        System.out.println("Sum: " + sum);
    }
}

// A: for(int i = 2; i<=i; i++){
            // for(int j = 2; j<n; j++){
                // if(i%j==0) continue A;
            // }
            // l++;
            // sum += i/Math.pow(a,l);
        // }