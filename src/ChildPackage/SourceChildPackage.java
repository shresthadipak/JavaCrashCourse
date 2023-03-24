package ChildPackage;

import SourcePackage.SourceJava;

public class SourceChildPackage extends SourceJava {

    public static void main(String[] args){
        SourceChildPackage modObj = new SourceChildPackage();
        System.out.println(modObj.publicInt);
        //System.out.println(modObj.privateInt); // not accessible
        System.out.println(modObj.protectedInt);
        //System.out.println(modObj.defaultInt); // not accessible
    }

}
