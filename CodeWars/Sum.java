/*
A function taking an array of numbers and returns the sum
of numbers.
-The numbers can be negative or non-integer.
-If array does not contain any numbers then return 0
*/

public class Sum{
    public static double sum(double[] numbers){
        
        //check if array is empty then return 0
        if(numbers.length == 0) {
            return 0;
        }
        
        double sum = 0;
        //var for storing our sum
        for(int i=0; i<numbers.length; i++){
            
            sum += numbers[i];
            //adds the current value of sum to the number at our current position
            //by the end of the loop, sum holds the total of all the elements.
        }
        return sum;
        
    }
}