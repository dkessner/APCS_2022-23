//
// Circle.java
//


public class Circle
{
    public Circle(double radiusIn)
    {
        radius = radiusIn;
    }

    // public accessor function

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2* Math.PI * radius;
    }

    private double radius;
}


