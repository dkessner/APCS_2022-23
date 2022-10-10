//
// CircleTest.java
//


public class CircleTest
{
    public static void testArea(Circle c, double expectedArea)
    {
        double result = c.area();

        System.out.println("radius: " + c.getRadius() + " expected: " +
                expectedArea + " result: " + result);

        if (Math.abs(result - expectedArea) < .001)
            System.out.println("PASSED");
        else
            System.out.println("FAILED");
    }


    public static void main(String[] args)
    {
        Circle c1 = new Circle(10);
        System.out.println("radius: " + c1.getRadius());
        System.out.println("area: " + c1.area());
        System.out.println("circumference: " + c1.circumference());

        Circle c2 = new Circle(1);

        // unit tests

        testArea(c1, 314.159);
        testArea(c2, 3.1415);
    }
}


