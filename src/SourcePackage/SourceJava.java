package SourcePackage;

public class SourceJava {
        public int publicInt= 10;
        private int privateInt = 20;
        protected int protectedInt = 40;
        int defaultInt = 80;

        public static void main(String[] args){
            SourceJava modObj = new SourceJava();
            System.out.println(modObj.publicInt);
            System.out.println(modObj.privateInt);
            System.out.println(modObj.protectedInt);
            System.out.println(modObj.defaultInt);
        }

}
