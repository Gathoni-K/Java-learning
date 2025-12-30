/*
-Given an array of integers, reverse it in place.
-Modify the OG arrya.
-No new array is allowed.
-Used indices only.

*/

package Notes.Arrays;

public class Reverse {
    public static void reverse(int[] arr) {

        //create our two pointers, left and right
        int left = 0;
        //create a var left with value of number in the first position in our array
        int right = arr.length - 1;
        //create var right whose value is the last number in the array
        
        while (left < right) {
            //while left is smaller than right
            int temp = arr[left];
            //create a var temp and it's value is the the firt element in our array
            arr[left] = arr[right];
            //the first element of our array now becomes the last
            arr[right] = temp;
            //the last value of our array now becomes the first

            left ++;
            right --;
            //move the pointers inwards
        }
    }
}
