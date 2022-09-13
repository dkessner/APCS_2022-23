public class HelloJava
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        for (int i=0; i<10; i++)
        {
            if (i%2 == 0)
            {
                System.out.println("Even");
            }
            else if (i == 7)
            {
                System.out.println("Lucky!");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
