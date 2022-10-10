//
// PersonTest.java
//


public class PersonTest
{
    public static void main(String[] args)
    {
        // create a new object (instance) of type Person

        Person p = new Person("Dr.Kessner"); 

        // error: access of private variable
        //p.name = "Dr. Kessner"; 

        p.hello();

        Person p2 = new Person("Alene");
        p2.hello();
    }
}


