//
// Student.java
//


public class Student extends Person
{
    public Student(String name)
    {
        super(name); // calls Person constructor
    }

    public int add(int a, int b)
    {
        return a + b;
    }

    public String hello()
    {
        return "Hello, I'm " + name + 
            " and I'm a Marlborough student.";
    }
}


