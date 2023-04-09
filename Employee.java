import java.util.Scanner;
public class Employee{
    int pan ;
    String name ; 
    double taxincome; 
    double tax; 
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pan, name and taxable income");
        pan = in.nextInt();
        name = in.next();
        taxincome = in.nextDouble();
    }
    public void cal(){
        if(taxincome <= 250000) tax = 0;
        else if(taxincome <= 500000 )tax = 10/100.0 * (taxincome-250000);
        else if(taxincome <= 1000000) tax = 30000 + 20/100.0 * (taxincome-500000);
        else tax = 50000 + 30/100.0 * (taxincome - 1000000);
    }
    public void display(){
        System.out.println("Pan Number\tName\tTax-income\tTax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.input();
        obj.cal();
        obj.display();
    }
}