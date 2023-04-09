package Pattern;
public class a9{
    public static void main(){
        for(int i = 1; i<=9; i+=2){
            for(int j = i; j>=1; j-=2){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}