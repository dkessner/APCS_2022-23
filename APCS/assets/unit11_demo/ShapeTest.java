//
// ShapeTest.java
//


import java.util.*;


public class ShapeTest
{
    public static void main(String[] args)
    {
        // add stuff to list of shapes

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Rectangle r1 = new Rectangle(10, 20);
        shapes.add(r1);

        Rectangle r2 = new Rectangle(100, 200);
        shapes.add(r2);

        Circle c1 = new Circle(10);
        shapes.add(c1);

        Circle c2 = new Circle(100);
        shapes.add(c2);

        // print out shape info

        for (Shape s : shapes)
            System.out.println(s.name() + " " + s.sideCount() +
                    " " + s.perimeter());

    }
}


