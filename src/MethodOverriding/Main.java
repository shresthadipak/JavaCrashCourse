package MethodOverriding;

public class Main {
    public static  void main(String[] args){
        Bicycle mObj = new MotoBike(10, 2, 30);
        mObj.applyBrake(1);
        System.out.println("Speed of the bike is: "+mObj.speed);
    }
}
