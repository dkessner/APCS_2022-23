//
// PiggyBank.java
//


public class PiggyBank
{
    public PiggyBank()
    {
        // initialization of the object goes here
        amount = 0;
    }

    public void addNickel()
    {
        amount += .05;
    }

    public void addDime()
    {
        amount += .10;
    }

    public void addQuarter()
    {
        amount += .25;
    }

    public double total()
    {
        return amount;
    }

    private double amount;
}


