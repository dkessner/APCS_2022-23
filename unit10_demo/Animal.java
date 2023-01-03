//
// Animal.java
//


public class Animal
{
    public Animal(String name, String type, int legCount)
    {
        this.name = name;
        this.type = type;
        this.legCount = legCount;
    }

    public String getName() 
    {
        return name;
    }

    public String getType() 
    {
        return type;
    }

    public int getLegCount() 
    {
        return legCount;
    }

    private String name;
    private String type;
    private int legCount;
}


