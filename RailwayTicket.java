import java.util.Scanner;
public class RailwayTicket{
    String name, coach; long mob_no;
    int amt, totalamt;
    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Name, coach, mobileNo. and basic amount");
        name = in.next();
        coach = in.next();
        mob_no = in.nextLong();
        amt = in.nextInt();
    }
    public void update(){
        if(coach.equals("First_AC")) totalamt = amt +700;
        else if(coach.equals("Second_AC")) totalamt = amt + 500;
        else if(coach.equals("Third_AC")) totalamt = amt + 250;
        else if(coach.equals("Sleeper")) totalamt = 0;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile: " + mob_no);
        System.out.println("Total Amount: " + totalamt);
    }
    public static void main(String[] args){
        RailwayTicket obj = new RailwayTicket();
        obj.accept();
        obj.update();
        obj.display();
    }
}