package Pattern;
public class d1_8{
    public static void main(){
        int a = 0;
        for(int i = 1; i<=10; i++){
            a = 0;
            for(int j =0; j<i; j++){
                a += (int)Math.pow(10,j);
            }
            System.out.print(a + ", ");
        }
    }
}