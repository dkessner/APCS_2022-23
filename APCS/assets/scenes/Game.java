// 
// Game.java
//


import processing.core.*;
import java.util.*;


public class Game extends PApplet
{
    public void settings()
    {
        size(600, 600);
    }

    public void setup()
    {
        scenes = new ArrayList<Scene>();
        scenes.add(new StartScene(this));
        scenes.add(new GameScene(this));
        scenes.add(new EndScene(this));
    }

    public void draw()
    {
        scenes.get(current).display();
    }

    public void keyPressed()
    {
        if (keyCode == ENTER)
        {
            current++;
            if (current >= scenes.size())
                current = 0;
        }

        scenes.get(current).handleKeyPressed();
    }

    private ArrayList<Scene> scenes;
    private int current = 0;

    public static void main(String[] args)
    {
        PApplet.main("Game");
    }
}


