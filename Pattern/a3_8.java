package Pattern;
public class a3_8{
    public static void main(int a,int n){
        double sum = 0;
        for(int i =1; i<n; i++){
            sum += Math.pow(a,n);
        }
        System.out.println("Sum: " + sum);
    }
}