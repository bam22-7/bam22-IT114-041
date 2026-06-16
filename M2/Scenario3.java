package M2;
// copilot: disable
// @ts-nocheck

public class Scenario3 extends BaseClass {
    private static Integer[] array1 = {42, -17, 89, -256, 1024, -4096, 50000, -123456};
    private static Double[] array2 = {3.14159265358979, -2.718281828459, 1.61803398875, -0.5772156649, 0.0000001, -1000000.0};
    private static Float[] array3 = {1.1f, -2.2f, 3.3f, -4.4f, 5.5f, -6.6f, 7.7f, -8.8f};
    private static String[] array4 = {"123", "-456", "789.01", "-234.56", "0.00001", "-99999999"};
    private static Object[] array5 = {-1, 1, 2.0f, -2.0d, "3", "-3.0"};
    private static void bePositive(Object[] arr, int arrayNumber) {
        // Only make edits between the designated "Start" and "End" comments
        printScenario3ArrayInfo(arr, arrayNumber);
        // This should be solved without Copilot auto-completion, to toggle it, click the Copilot chat bubble at the top of the editor.
        //  Configure inline suggestions to "Disabled Inline Suggestions" (or similar) when writing code for this problem.

        // Challenge 1: Make each value positive
        // Challenge 2: Convert the values back to their original data type and assign it to the proper slot in the `output` array
        // Step 1: sketch out plan using comments (include ucid and date)
        // Step 2: Add/commit your outline of comments (required for full credit)
        // Step 3: Add code to solve the problem (add/commit as needed)
        Object[] output = new Object[arr.length];
        // Start Solution Edits

                //bam22 6-16-26

        //Step 1: Iterate the array by using a for loop
        //Step 2: use instanceof to check type
        //Step 3: Use basic conditionals and multiplication by -1 to make positive
        //Step 4: convert back to original types
        //Step 5: assign back to the same slot of the output array

        for (int i = 0; i < arr.length; i++) {
            Object val = arr[i];

            if (val instanceof Integer) {
                int num = (Integer) val;
                if (num < 0) {
                    num = num * -1;
                }
                output[i] = num;
                
            } else if (val instanceof Double) {
                double num = (Double) val;
                if (num < 0) {
                    num = num * -1.0;
                }
                output[i] = num;
                
            } else if (val instanceof Float) {
                float num = (Float) val;
                if (num < 0) {
                    num = num * -1.0f;
                }
                output[i] = num;
                
            } else if (val instanceof String) {
                String strVal = (String) val;
                
                output[i] = strVal.replace("-", "");
                
            } else {

                try {
                    output[i] = val; 
                } catch (Exception e) {
                    output[i] = val;
                }
            }
        }
        // End Solution Edits
        printOutputWithType(output, true);
    }

    public static void main(String[] args) { 
        final String ucid = "bam22"; // <-- change to your UCID
        // no edits below this line
        printHeader(ucid, 3);
        bePositive(array1, 1);
        bePositive(array2, 2);
        bePositive(array3, 3);
        bePositive(array4, 4);
        bePositive(array5, 5);
        printFooter(ucid, 3);

    }
}