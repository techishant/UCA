import java.util.Scanner;
public class Mobike{
    int bno, phno,days,charge;
    String name;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter bikeno., phno, name and days");
        bno = in.nextInt();
        phno = in.nextInt();
        name = in.next();
        days = in.nextInt();
    }
    public void cal(){
        if(days<=5) charge = 500 *days;
        else if(days<=10) charge = 500*5+400*(days-5);
        else charge = 500*5 + 400* 5 + (days-10) * 200;
    }
    public void display(){
        System.out.println("Bike No.\tPhone No.\tName\tDays\tcharge");
        System.out.println(bno + "\t" + phno + "\t" + name + "\t" + days + "\t" + charge);
    }
    public static void main(String[] args){
        Mobike obj = new Mobike();
        obj.input();
        obj.cal();
        obj.display();
    }
}