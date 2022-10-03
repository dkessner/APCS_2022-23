//
// HelloAlgorithms.java
//


public class HelloAlgorithms
{
    public static int findA(String name)
    {
        for (int i=0; i<name.length(); i++)
        {
            String c = name.substring(i, i+1);
            if (c.equals("A") || c.equals("a"))
                return i;
        }

        return -1;  // or name.size()
    }


    public static int countA(String name)
    {
        int n = 0;

        for (int i=0; i<name.length(); i++)
        {
            String c = name.substring(i, i+1);
            if (c.equals("A") || c.equals("a"))
                n++;
        }

        return n;
    }


    public static int sum(int n)
    {
        // return 1 + 2 + 3 + ... + n

        int result = 0;

        for (int i=1; i<=n; i++)
        {
            result += i;
        }

        return result;
    }

    public static String binimate(String s)
    {
        // return the substring by killing every other letter 
        // "banana" -> "bnn"
        // "Mississippi" -> "Msispi"

        String result = "";

        for (int i=0; i<s.length(); i++)
        {
            if (i%2 == 0)
                result = result + s.substring(i, i+1);
        }

        return result;
    }


    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        System.out.println("position of A in Chase:" + findA("Chase"));
        System.out.println("number of As in SarahAlene:" + countA("SarahAlene"));

        System.out.println("sum(4):" + sum(4));
        System.out.println("sum(5):" + sum(5));

        System.out.println("binimate(banana):" + binimate("banana"));
        System.out.println("binimate(Mississippi):" + binimate("Mississippi"));
    }
}


