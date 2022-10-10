//
// Person.java
//


public class Person
{
    // constructor -- gets called with "new Person()"

    public Person(String nameIn)
    {
        name = nameIn;
    }

    // don't do this:  public variable

    private String name; // member variable

    // member function

    public void hello()
    {
        System.out.println("Hello, my name is " + name);
    }
}


