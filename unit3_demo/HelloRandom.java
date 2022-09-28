//
// HelloRandom.java
//


public class HelloRandom
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        for (int i=0; i<5; i++)
            System.out.println(Math.random());

        System.out.println();

        for (int i=0; i<5; i++)
        {
            double result = Math.random() * 100;
            System.out.println(result);
        }

        System.out.println();

        for (int i=0; i<5; i++)
        {
            double result = Math.random() * 100 + 100;
            System.out.println(result);
        }

        System.out.println();

        for (int i=0; i<5; i++)
        {
            int result = (int)(Math.random() * 100 + 100); // int cast
            System.out.println(result);
        }
    }
}


