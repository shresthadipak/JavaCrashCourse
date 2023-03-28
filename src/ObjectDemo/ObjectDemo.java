package ObjectDemo;

public class ObjectDemo implements Cloneable{
    int a;
    String s;

    public ObjectDemo(int a, String s){
        this.a = a;
        this.s = s;
    }

    public static void main(String[] args){
        try{
            ObjectDemo obj = new ObjectDemo(10, "Hello");
            System.out.println("Object values: "+obj.a+"::"+obj.s);

            ObjectDemo obj2 = new ObjectDemo(20, "Test");
            System.out.println("Object Comparison using equals: "+obj.equals(obj2));

            ObjectDemo obj3 = (ObjectDemo) obj.clone();
            System.out.println("Object Comparison using cloneable: "+obj.equals(obj3));

            System.out.println("Obj Hashcode is: "+obj.hashCode());
            System.out.println("Obj2 Hashcode is: "+obj2.hashCode());
            System.out.println("Obj3 Hashcode is: "+obj3.hashCode());
        }catch(Exception e){

        }
    }

    public int hashCode(){
        int code = 1;
        code = code + 11 + a;
        code = code + 13 + s.hashCode();
        return code;
    }

    public boolean equals(ObjectDemo obj){
        if((this.a == obj.a) && (this.s == obj.s)) return true;
        else return false;
    }

}
