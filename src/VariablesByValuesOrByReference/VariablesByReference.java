package VariablesByValuesOrByReference;

public class VariablesByReference {
    public static void changedByReference(testRefValue a){
        a.val = a.val + 10;
        System.out.println("Value a inside: "+a.val);
    }

    public static void main(String[] args){
        testRefValue refObj = new testRefValue();
         refObj.val= 4;
        System.out.println("Value before calling: "+refObj.val);
        changedByReference(refObj);
        System.out.println("Value after calling: "+refObj.val);
    }

}

class testRefValue{
    int val;
}
