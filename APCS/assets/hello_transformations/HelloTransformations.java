//
// HelloTransformations.java
//


import processing.core.*;


public class HelloTransformations extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        
    }

    public void draw()
    {
        background(0);

        // green square

        pushMatrix(); // save coordinate system
            translate(width/2, height/2); // move origin to middle of screen
            rotate(angle);
            fill(0, 255, 0);
            rectMode(CENTER);
            rect(0, 0, 100, 100);
        popMatrix(); // restore coordinate system
        
        angle += .01;

        // blue circle
        fill(0, 0, 255);
        ellipse(25, 25, 50, 50);
    }

    private float angle = 0f;

    public static void main(String[] args)
    {
        PApplet.main("HelloTransformations");
    }
}


