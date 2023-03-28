package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args){
        Bicycle cycle = new Bicycle(10, 1);
        cycle.brake(5);
        System.out.println("Speed: "+cycle.speed);

        Motorcycle bike = new Motorcycle(20, 30, 2);
        bike.brake(1);
        bike.inSpeed(10);
        bike.setGear(4);
        System.out.println("Speed: "+bike.speed);

    }
}
