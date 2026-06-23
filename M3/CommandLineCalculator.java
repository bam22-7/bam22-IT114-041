package M3;

/*
Challenge 1: Command-Line Calculator
------------------------------------
- Accept two numbers and an operator as command-line arguments
- Supports addition (+) and subtraction (-)
- Allow integer and floating-point numbers
- Ensures correct decimal places in output based on input (e.g., 0.1 + 0.2 → 1 decimal place)
- Display an error for invalid inputs or unsupported operators
- Capture 5 variations of tests
*/

public class CommandLineCalculator extends BaseClass {
    private static String ucid = "bam22"; // <-- change to your ucid

    public static void main(String[] args) {
        printHeader(ucid, 1, "Objective: Implement a calculator using command-line arguments.");

        if (args.length != 3) {
            System.out.println("Usage: java M3.CommandLineCalculator <num1> <operator> <num2>");
            printFooter(ucid, 1);
            return;
        }

        try {
            System.out.println("Calculating result...");
             //bam22 6-23-26

        
         //Step 1:  The program accepts three command line arguments
        //Step 2: it validates the three arguments and ans that it is positive or negative 
        //Step 3: both values are parsed as doubles
        //Step 4: makes sure that the output has the correct about of decimel places
        //Step 5: Performs calulations based on the operator and formats it properly

        String num1Str = args[0];         
            String operator = args[1];     
            String num2Str = args[2]; 

            
            if (!operator.equals("+") && !operator.equals("-")) {
                System.out.println("Error: Unsupported operator. Use + or - only.");
                printFooter(ucid, 1);
                return;
            }

            
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);  

            
            double result = operator.equals("+") ? (num1 + num2) : (num1 - num2);

            
            int precision = Math.max(getDecimalPlaces(num1Str), getDecimalPlaces(num2Str));

            String format = "%." + precision + "f";
            System.out.println(num1Str + " " + operator + " " + num2Str + " = " + String.format(format, result));
            // extract the equation (format is <num1> <operator> <num2>)

            // check if operator is addition or subtraction

            // check the type of each number and choose appropriate parsing

            // generate the equation result (Important: ensure decimals display as the
            // longest decimal passed)
            // i.e., 0.1 + 0.2 would show as one decimal place (0.3), 0.11 + 0.2 would shows
            // as two (0.31), etc
            

        } catch (Exception e) {
            System.out.println("Invalid input. Please ensure correct format and valid numbers."); 
        }

        printFooter(ucid, 1);

         }

    
    private static int getDecimalPlaces(String numStr) {
        if (numStr.contains(".")) {
            return numStr.length() - numStr.indexOf('.') - 1;
        }
        return 0;
    }
}
