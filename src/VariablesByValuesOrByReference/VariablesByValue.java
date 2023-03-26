package VariablesByValuesOrByReference;

public class VariablesByValue {
    public static void changedByValue(int a){
        a = a + 10;
        System.out.println("Value a inside: "+a);
    }

    public static void main(String[] args){
        int a = 4;
        System.out.println("Value before calling: "+a);
        changedByValue(a);
        System.out.println("Value after calling: "+a);
    }

}
