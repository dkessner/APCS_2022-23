//
// Rectangle.java
//


public class Rectangle implements Shape
{
    public Rectangle(double w, double h)
    {
        this.w = w;
        this.h = h;
    }

    public String name() {return "Rectangle";}

    public int sideCount()
    {
        return 4;
    }

    public double perimeter()
    {
        return 2*w + 2*h;
    }

    private double w;
    private double h;
}


