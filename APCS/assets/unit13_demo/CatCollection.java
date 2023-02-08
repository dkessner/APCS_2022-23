//
// CatCollection.java
//


import java.util.*;


public class CatCollection
{
    public CatCollection()
    {
        cats = new ArrayList<Cat>();
    }

    public void adopt(String name, String color, float fleaCount)
    {
        Cat cat = new Cat(name, color, fleaCount);
        cats.add(cat);
    }

    public void callToDinner()
    {
        for (Cat c : cats)
            System.out.println(c.getName() + ": meow!");
    }

    public ArrayList<Cat> getBlackCats()
    {
        ArrayList<Cat> result = new ArrayList<Cat>();

        for (Cat c : cats)
            if (c.getColor().equals("Black"))
                result.add(c);

        return result;
    }

    public float getFleaDensity()
    {
        float total = 0f;

        for (Cat c : cats)
            total += c.getFleaCount();

        return total / cats.size();
    }

    private ArrayList<Cat> cats;


    public static void main(String[] args)
    {
        CatCollection collection = new CatCollection();

        collection.adopt("Gadget", "Black", 6.0f);
        collection.adopt("Tux", "Black", 4.0f);
        collection.adopt("Simba", "Orange", 10.0f);
        collection.adopt("Nala", "Orange", 0.0f);

        collection.callToDinner();

        System.out.println("black cats:" + collection.getBlackCats());
        System.out.println("flea density: " + collection.getFleaDensity());
    }
}


