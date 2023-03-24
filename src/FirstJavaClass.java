public class FirstJavaClass {

    String name = "Dipak";

    String getName(){
        return name;
    }
    public static void main(String[] args){
        FirstJavaClass testObj = new FirstJavaClass();
        System.out.println(testObj.getName());
    }
}
