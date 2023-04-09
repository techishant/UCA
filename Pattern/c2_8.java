package Pattern;
public class c2_8{
    public static void main(int n){
        int sum =0;
        for(int i = 1; i<=n; i++){
            for(int j = i; i<=i; j++){
                sum+=j;
            }
        }
        System.out.println("Sum: " + sum);
    }
}