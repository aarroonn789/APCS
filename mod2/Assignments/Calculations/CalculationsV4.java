
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Aaron Harabedian
 * @version 10-05-17
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        // Declare variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 63;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        double dNum4 = 17.9;
        
        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + ( iNum1 + iNum2 ) );
        System.out.println( dNum1 + " + " + dNum2 + " + " + dNum3 + " = " + ( dNum1 + dNum2 + dNum3 ) );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + ( iNum3 - iNum2 - iNum1 ) );
        System.out.println( dNum2 + " - " + dNum3 + " = " + ( dNum2 - dNum3 ) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " * " + iNum2 + " = " + ( iNum1 * iNum2 ) ); 
        System.out.println( dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + ( dNum2 * dNum3 * dNum3 ) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( iNum2 + " / " + iNum1 + " = " + ( iNum2 / iNum1 ) );
        System.out.println( dNum1 + " / " + dNum3 + " = " + ( dNum1 / dNum3 ) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3 + " % " + iNum2 + " = " + ( iNum3 % iNum2 ) );
        System.out.println( dNum3 + " % " + dNum2 + " = " + ( dNum3 % dNum2 ) );
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Integer Combinations");
        System.out.println( iNum4 + " / " + iNum2 + " + " + iNum3 + " = " + ( iNum4 / iNum2 + iNum3 ) );
        System.out.println( iNum1 + " % " + iNum3 + " * " + iNum2 + " = " + ( iNum1 % iNum3 * iNum2 ) );
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class