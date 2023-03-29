package Accessiblity;

public class Rectangle {
    private int length;
    private int breadth;

    protected int getArea(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        return (this.length * this.breadth);
    }

}
