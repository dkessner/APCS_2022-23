//
// HelloRecursion.java
//


public class HelloRecursion
{
    public static int factorial(int n)
    {
        if (n <= 1) return 1;

        return factorial(n-1) * n;
    }

    public static void main(String[] args)
    {
        for (int i=0; i<20; i++)
            System.out.println(i + " " + factorial(i));
    }
}


