import java.util.Scanner;
public class carDepreciation{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the showroom price and number of years the car was used: ");
        double price = in.nextDouble();
        int n = in.nextInt();
        double amt = 0;
        int rate = 0;
        if(n==1){
            rate = 10;
        }else if(n==2){
            rate = 20;
        }else if(n==3){
            rate = 30;
        }else if(n==4){
            rate = 50;
        }else{
            rate = 60;
        }
        amt = price - rate/100.0 * price;
        System.out.println("Original Price: " + price);
        System.out.println("Depreciated Value: " + (price-amt   ));
        System.out.println("Amount: " + amt);
    }
}