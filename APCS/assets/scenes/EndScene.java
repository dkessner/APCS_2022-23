//
// EndScene.java
//


import processing.core.*;


public class EndScene implements Scene
{
    public EndScene(PApplet p)
    {
        this.p = p;
    }

    public void display()
    {
        p.background(0);
        p.textAlign(PApplet.CENTER);
        p.textSize(50);
        p.fill(255, 0, 0);
        p.text("GAME OVER", p.width/2, p.height/2);
    }

    public void handleKeyPressed()
    {

    }

    private PApplet p;
}


