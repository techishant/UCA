package Pattern;
public class f9{
    public static void main(){
        for(int i =1; i<=5; i++){
            for(int j =1; j<=5; j++){
                int k = i>j ? i: j;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

