package AccessModifiersEncapsulationSourcePackage;

public class testJava {
    public static void main(String[] args){
        SourceJava modObj = new SourceJava();
        System.out.println(modObj.publicInt);
       // System.out.println(modObj.privateInt); // Not working here cause it is private access modifiers
        System.out.println(modObj.protectedInt);
        System.out.println(modObj.defaultInt);
    }
}
