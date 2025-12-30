/*
Given an ' int[] numbers ' write a method returning the sum of 
all elements.
-Use a loop, handle an empty array.
-Method signature:
    'public static int sum(int[] numbers)'

 */



package Notes.Arrays;

public class Sum {

    public static int sum(int[] numbers){


    //handles an empty array

    /*
    -the explicit empty array check is redundant and can be removed
    -our loop condition already handles our edge case
    */

    int sum = 0;
    //container for storing our sum
    for (int i =0; i<numbers.length; i++){
        sum += numbers[i];
    }
    
    return sum;
}
    
}
