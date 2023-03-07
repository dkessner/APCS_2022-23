//
// RecursionDemo.pde
//


import processing.core.*;


public class RecursionDemo extends PApplet
{
    public void settings()
    {
        size(600, 600);
    }

    public void draw()
    {
        background(0);
        fill(255);
        textSize(30);
        textAlign(CENTER);
        text(startingLevel, width/2, height*.1f);

        translate(width/2, height*.85f);
        drawBall(startingLevel);
    }

    private void drawBall(int level)
    {
        fill(0, 255-level*30, 255);
        ellipse(0, 0, 100, 100);

        if (level >= 0)
        {
          pushMatrix();
          rotate(PI/12);
          scale(.9f);
          translate(0, -50);
          drawBall(level-1);
          popMatrix();

          pushMatrix();
          rotate(-PI/12);
          scale(.9f);
          translate(0, -50);
          drawBall(level-1);
          popMatrix();
        }
    }

    public void keyPressed()
    {
        if (keyCode == UP && startingLevel<12)
            startingLevel++;
        else if (keyCode == DOWN && startingLevel>0)
            startingLevel--;
    }

    private int startingLevel = 0;

    public static void main(String[] args)
    {
        PApplet.main("RecursionDemo");
    }
}
