package Epam.Cleancode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Cost c= new Cost();
    	System.out.println(c.calculateCost(3, 1500, true));
    	CalcInterest ci= new CalcInterest();
    	System.out.println(ci.simpleIntrest(1000, 2, 30));
    	System.out.println(ci.compoundIntrest(1000, 2, 30));
    	 
    }
}
