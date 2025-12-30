/*
-create a class calculator with the following methods:
-add, subtract and average

-then in main, create a calculator object calling all three methods and print the 
result

*/

package Notes.Methods;

public class Calculator {
    
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double average(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int average = sum / numbers.length;
        return average;
    }

    /*
    -Static methods do not require an object
    */

    public static void main(String[]args) {
        // Calculator calculator = new Calculator();

        int r1 = add(23, 67);
        int r2 = subtract(2, 5);
        
        int[] nums = {23, 45, 67, 9};
        double r3 = average(nums);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
