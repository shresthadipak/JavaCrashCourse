package Inheritance;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int startSpeed, int startGear){
        speed = startSpeed;
        gear = startGear;
    }

    public void setGear(int startGear) {
        gear = startGear;
    }

    public void brake(int decrement){
        speed -= decrement;
    }

    public void inSpeed(int increment){
        speed += increment;
    }
}
