package Pattern;
public class  b1_8{
    public static void main(){
        int j = 1;
        for(int i = 1; i<=10; i++){
            if(i%2 ==0)
                System.out.print(-j+ ", ");
            else 
                System.out.print(j+ ", ");
            j+=2;
        }
    }
}