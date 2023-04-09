package Pattern;
public class d3_8{
    public static void main(int a, int n){
        double sum = 0.0;
        for(int i= 1; i<n; i++){
            sum += i/(Math.pow(a,i));
        }
        System.out.println("Sum: " + sum);
        
    }
}