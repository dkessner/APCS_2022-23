//
// Circle.java
//


public class Circle implements Shape
{
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public String name()
    {
        return "Circle";
    }

    public int sideCount() {return 0;}

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    private double radius;
}


