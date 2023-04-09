import java.util.Scanner;
public class Student{
    String name; 
    int eng, hn, mts;
    double total, avg;
    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name and marks in enlgish hindi and maths");
        name = in.next();
        eng = in.nextInt();
        hn  = in.nextInt();
        mts = in.nextInt();
    }
    public void compute(){
        total = eng + hn + mts;
        avg = total/3.0;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("English\tHindi\tMaths");
        System.out.println(eng + "\t" + hn + "\t" + mts);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
    public static void main(String[] args){
        Student obj = new Student();
        obj.accept();
        obj.compute();
        obj.display();
    }
}