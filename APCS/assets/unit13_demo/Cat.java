//
// Cat.java
//


public class Cat
{
    public Cat(String name, String color, float fleaCount)
    {
        this.name = name;
        this.color = color;
        this.fleaCount = fleaCount;
    }

    public String getName() {return name;}
    public String getColor() {return color;}
    public float getFleaCount() {return fleaCount;}
    public String toString() {return name + " " + color;}

    private String name;
    private String color;
    private float fleaCount;
}


