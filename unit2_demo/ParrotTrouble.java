//
// ParrotTrouble.java
//


public class ParrotTrouble
{
    public static void testParrotTrouble(boolean talking, 
                                         int hour, 
                                         boolean expected)
    {
        boolean result = parrotTrouble(talking, hour);

        System.out.print("talking: " + talking + " hour: " + hour +
                " expected: " + expected + " result: " + result);

        if (result == expected)
            System.out.println(" Woohoo!");
        else
            System.out.println(" Boohoo!");
    }

    public static boolean parrotTrouble(boolean talking, int hour)
    {
        return talking & (hour<7 || hour>20); 
    }

    public static void main(String[] args)
    {
        testParrotTrouble(true, 6, true);                
        testParrotTrouble(true, 7, false);                
        testParrotTrouble(false, 6, false);                
    }
}


