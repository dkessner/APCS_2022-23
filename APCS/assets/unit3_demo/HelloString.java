//
// HelloString.java
//


public class HelloString
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        String name = "Dr. Kessner";
        System.out.println(name);

        System.out.println("one" + "two");

        name = "hello Sarah";
        System.out.println(name);

        System.out.println("length: " + name.length());

        System.out.println(name.substring(0,5));
            
        String sarah = name.substring(6, 11);
        System.out.println("sarah: " + sarah);

        String sarah2 = new String("Sarah"); 
        System.out.println("sarah2: " + sarah2);

        System.out.println("==: " + (sarah == sarah2));
        System.out.println("equals: " + sarah.equals(sarah2));
    }
}


