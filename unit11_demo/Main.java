//
// Main.java
//


import java.util.*;


public class Main
{
    public static void main(String[] args)
    {
        Person drkessner = new Person("Dr. Kessner");
        System.out.println(drkessner.hello());

        Student sarah = new Student("Sarah");
        System.out.println(sarah.hello());

        System.out.println();

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(drkessner);
        people.add(sarah);

        for (Person p : people)
            System.out.println(p.hello());
    }
}


