public class FirstJavaClass {

    String name = "Dipak";

    String getName(){
        return name;
    }
    public static void main(String[] args){
        FirstJavaClass testObj = new FirstJavaClass();
        System.out.println(testObj.getName());

        // Access the Account class and methods from another class
        Account accObj = new Account("002023", "SA", 400);
        accObj.cashDeposit(1000);
        System.out.println(accObj.getAmount());
    }
}
