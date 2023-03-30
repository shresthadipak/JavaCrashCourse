package MethodOverriding;

public class MotoBike extends Bicycle{
    int height;

    public MotoBike(int startHeight, int startGear, int startSpeed){
        super(startGear, startSpeed);
        this.height = startHeight;
    }

    @Override
    public void applyBrake(int decrement){
        speed = speed - decrement - 10;
    }
}
