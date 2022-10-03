//
// HelloLoops.java
//


public class HelloLoops
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        // int i=0:  initialization
        // i<10:  condition
        // i++:  update

        for (int i=0; i<10; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        int i = 0;
        while (i<10)
        {
            i++;

            if (i == 5)
                continue;
            
            if (i == 7)
                break;

            System.out.println(i);
        }
        
        System.out.println();

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<10);
    }
}


