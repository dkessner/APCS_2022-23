//
// GameScene.java
//


import processing.core.*;


public class GameScene implements Scene
{
    public GameScene(PApplet p)
    {
        this.p = p;
        this.position = new PVector(25, 25);
    }

    public void display()
    {
        p.background(0);

        // target
        p.fill(0, 255, 0);
        p.rect(p.width-100, p.height-100, 100, 100);

        // player
        p.fill(0, 0, 255);
        p.ellipse(position.x, position.y, 50, 50);
    }

    public void handleKeyPressed()
    {
        if (p.keyCode == PApplet.RIGHT)
            position.x += 50;
        else if (p.keyCode == PApplet.LEFT)
            position.x -= 50;
        else if (p.keyCode == PApplet.DOWN)
            position.y += 50;
        else if (p.keyCode == PApplet.UP)
            position.y -= 50;
    }

    private PApplet p;
    private PVector position;
}


