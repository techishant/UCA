package Pattern;
public class c1_8{
    public static void main(){
        for(int i =0;i<10; i++){
            if(i%2 != 0) System.out.print(Math.pow(2,i) + ", ");
            else System.out.print(Math.pow(2, i)-1 + ", ");
        }
    }
}