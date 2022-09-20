//
// HelloFunctions.java
//


public class HelloFunctions
{
    public static boolean goodScore(double score)
    {
        if (score >= 500)
            return true;
        else
            return false;
    }

    public static float mult(float a, float b)
    {
        return a*b;
    }

    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static void hello()
    {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args)
    {
        hello();

        int c = sum(5, 7);
        System.out.println("c:" + c);

        float f = mult(1.23f, 10);  // 1.23f: float instead of double
        System.out.println("f:" + f);

        
        System.out.println("100: " + goodScore(100));
        System.out.println("1000: " + goodScore(1000));
    }



}


