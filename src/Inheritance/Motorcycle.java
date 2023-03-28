package Inheritance;

public class Motorcycle extends Bicycle{
    protected int height;

    public Motorcycle(int startHeight, int startSpeed, int startGear){
        super(startSpeed, startGear);
        height = startHeight;
    }

    public void setHeight(int value){
        height = value;
    }
}
