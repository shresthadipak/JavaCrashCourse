package NestedClass;

public class NestedClassDemo {
    class NestedClass{
        void printTest(){
            System.out.println("This is nested class demo");
        }
    }

    public static void main(String[] args){
        NestedClassDemo.NestedClass obj = new NestedClassDemo().new NestedClass();
        obj.printTest();
    }
}
