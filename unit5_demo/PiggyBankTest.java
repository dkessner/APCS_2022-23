//
// PiggyBankTest.java
//


public class PiggyBankTest
{
    public static void main(String[] args)
    {
        PiggyBank bank = new PiggyBank();
        
        bank.addNickel();
        bank.addNickel();
        bank.addDime();
        bank.addDime();
        bank.addQuarter();
        bank.addQuarter();

        System.out.println("bank total: " + bank.total());

        PiggyBank bank2 = new PiggyBank();
        bank2.addNickel();
        bank2.addDime();
        bank2.addDime();

        System.out.println("bank2 total: " + bank2.total());
    }
}


