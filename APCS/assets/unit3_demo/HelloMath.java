//
// HelloMath.java
//


public class HelloMath
{
    public static void main(String[] args)
    {
        System.out.println("Hello, math!");
        System.out.println("pi: " + Math.PI);
        System.out.println("e: " + Math.E);
        System.out.println("cos(pi): " + Math.cos(Math.PI)); 
        System.out.println("sin(pi): " + Math.sin(Math.PI)); 
        System.out.println("log(e): " + Math.log(Math.E)); 

        // Math is a class
        // Math.cos() is a "static" function (belongs to the class)

        double result = Math.sin(Math.PI);
        double expected = 0;

        //if (result == expected)
        if (Math.abs(result - expected) < 1e-6)
            System.out.println("We know math!");
        else
            System.out.println("Uh oh!");

        // scientific notation:  1e-6 == 1.0e-6 == .000001
    }
}


