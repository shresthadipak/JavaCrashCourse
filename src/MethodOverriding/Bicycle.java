package MethodOverriding;

public class Bicycle {
    int gear;
    int speed;

    public Bicycle(int startGear, int startSpeed){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }
}
