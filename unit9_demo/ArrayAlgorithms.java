//
// ArrayAlgorithms.java
//


import java.util.*;


public class ArrayAlgorithms
{
    public static String findShortest(String[] names)
    {
        String shortest = names[0];

        for (String name : names)
        {
            if (name.length() < shortest.length())
                shortest = name;
        }

        return shortest;
    }

    public static ArrayList<String> filterANames(String[] names)
    {
        // filter: return a new list with the ones we want

        ArrayList<String> result = new ArrayList<String>();

        for (String name : names)
        {
            if (name.substring(0,1).equals("A"))
                result.add(name);
        }

        return result;
    }

    public static int[] getLengths(String[] names)
    {
        // transform: return new list of lengths of names

        int[] result = new int[names.length];
        
        for (int i=0; i<names.length; i++)
        {
            result[i] = names[i].length();
        }

        return result;
    }

    public static ArrayList<String> generateFizzBuzz(int n)
    {
        // generate and return list of first n fizz buzz strings

        ArrayList<String> result = new ArrayList<String>();
    
        for (int i=0; i<n; i++)
        {
            if (i%15 == 0)
                result.add("FizzBuzz");
            else if (i%3 == 0)
                result.add("Fizz");
            else if (i%5 == 0)
                result.add("Buzz");
            else
                result.add("" + i);
        }

        return result;
    }

    public static void main(String[] args)
    {
        String[] names = {"Eloise", "Alene", "Madeleine", "Logan", "Ava"};
        
        System.out.println(names.length);
        for (String name : names)
            System.out.println(name);

        System.out.println();
        System.out.println("shortest: " + findShortest(names));

        System.out.println();
        ArrayList<String> aNames = filterANames(names);
        System.out.println("A names: ");
        for (String name : aNames)
            System.out.println(name);

        System.out.println();
        int[] lengths = getLengths(names);
        System.out.println("lengths: ");
        for (int length : lengths)
            System.out.println(length);

        ArrayList<String> fizzBuzzOutput = generateFizzBuzz(30);
        System.out.println("fizzBuzzOutput: " + fizzBuzzOutput);
    }
}


