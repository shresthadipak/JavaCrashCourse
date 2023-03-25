package StaticMembersPackage;

// static library
import static java.util.Calendar.MONDAY;

public class Circle {

    // declaration of identifiers
    static double pi;
    int radius;

    static{
        System.out.println("Initializing system....");
        pi = 3.14;
    }

    // Constructor
    public Circle(int radius){
        this.radius = radius;
        System.out.println("Inside Constructor");
    }

    // static method
    public static double piValue(){
        return pi;
    }

    public static void main(String[] args){
        Circle vObj1 = new Circle(5);
        Circle vObj2 = new Circle(10);
        System.out.println("Value of pi: "+vObj2.pi);

        if(MONDAY == 2){
            System.out.println("Today is Monday");
        }else{
            System.out.println("Today is not");
        }
    }

}
