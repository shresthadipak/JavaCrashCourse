package ChildPackage;

import SourcePackage.SourceJava;

public class ChildPackage {
    public static void main(String[] args){
        SourceJava modObj = new SourceJava();
        System.out.println(modObj.publicInt);

        // No accessible due to access modifiers in different package
        /* System.out.println(modObj.privateInt);
        System.out.println(modObj.protectedInt);
        System.out.println(modObj.defaultInt); **/
    }
}
