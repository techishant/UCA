package Pattern;

public class c9{
    public static void main(){
        int k =15;
        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }

    }
}