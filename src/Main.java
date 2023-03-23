public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        // Declare the Variables
        int a = 15;
        int b = 20;
        int c;
        c = a + b;
        System.out.println(c);

        // Declare the constant
        final int x = 30;
        final int y = 40;
        int z;
        z = x * y;
        System.out.println(z);

        // Initialize an array
        int[] q = new int[10];
        System.out.println(q.length);

        // loop
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // continue statement
        for(int i =0; i< 10; i++){
            if(i==6)
                continue;
            System.out.println(i);
        }

        // break statement
        for(int i =0; i< 10; i++){
            if(i==6)
                break;
            System.out.println(i);
        }


    }
}