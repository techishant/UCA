import java.util.Scanner;
public class Library{
    String name;
    int price;
    int day;
    double fine;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name and days");
        name = in.nextLine();
        day = in.nextInt();
    }
    public void cal(){
        if(day<=7) fine = 0.25*day;
        else if(day<=15) fine = 0.25 * 7 + (day-7) * 0.40;
        else if (day<=30) fine = 0.25 * 7 + 0.40*8 + (day-15)*0.60;
        else fine = 0.25*7 + 0.40 * 8+ 15*0.60 + (day-30) * 0.80;
    }
    public void display(){
        System.out.println("name\tfine");
        System.out.println(name + "\t"+ fine);
    }
    public static void main(String args[]){
        Library obj = new Library();
        obj.input();
        obj.cal();
        obj.display();
    }
}