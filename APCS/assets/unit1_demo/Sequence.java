public class Sequence
{
    public static void main(String[] args)
    {
        // method 1

        for (int i=7; i<30; i+=3)
        {
            System.out.println(i);
        }

        System.out.println();

        // method 2

        int n = 7;

        for (int i=0; i<10; i++)
        {
            System.out.println(n);
            n += 3;
        }

        System.out.println();

        // method 3

        for (int i=0; i<10; i++)
        {
            System.out.println(7 + 3*i);
        }
    }
}
