/*
-Given an array of integers, find the largest element.

-No sorting, extra arrays

*/

package Notes.Arrays;

public class MaxElement {

    public static int max(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        //handles the edge cases

        int max = numbers[0];
        //only works if an array has more than one element

        for(int i =1; i<numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    
}
