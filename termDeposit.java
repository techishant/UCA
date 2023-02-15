import java.util.Scanner;
public class termDeposit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sum and age and the term: ");
        double sum = in.nextDouble();
        int age = in.nextInt();
        int t = in.nextInt();
        int t1 = t;
        double interest = 0.0;
        double amt;
        
        if(age<60){
            if(t>=1){
                t=t-1;
                interest = 7.5/100 * sum;
            }if(t>=2){
                t=t-2;
                interest += 8.5/100 * sum;
            }if(t>=3){
                t=t-3;
                interest += 9.5/100 * sum;
            }if(t>3){
                interest += 10.0/100 * sum;
            }
        }else{
            if(t>=1){
                t=t-1;
                interest = 8.0/100 * sum;
            }if(t>=2){
                t=t-2;
                interest += 9.0/100 * sum;
            }if(t>=3){
                t=t-3;
                interest += 10.0/100 * sum;
            }if(t>3){
                interest += 11.0/100 * sum;
            }
        }
        
        amt = sum + interest;
        System.out.println("Amount Deposited\tTerm\tAge\tInterest Earned\tAmount Paid");
        System.out.println(sum+"\t\t\t"+t1+"\t"+age+"\t"+interest+"\t\t"+(sum+interest));
        
    }
}