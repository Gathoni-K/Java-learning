package logicgym;
/*
-Given a random non-negative number, return the digits of the number
within an array in reverse order.

    '
    35231 => [1,3,2,5,3]
    0 => [0]
    '
Pattern:
1.Receive the integer.
2.Create empty dynamic container.
3.While the no. has digits: 
-extract the last digits
-convert digit to desired type.
-store digit.
-remove the last digit.
4.Return the result
*/

public class Kata {
    public static int[] digitize(long n) {

        if(n == 0) {
            return new int[]{0};
        }

        long temp = n;
        //this line copies the number to variable temp
        int count = 0;
        //initialize the digit counter

        while(temp != 0){
            //loop while digits still exist
            count++;
            //one digit found
            temp /= 10;
            //remove last digit
        }

        int[] digits = new int[count];
        //creates the array, count provides us with the required size for this array.


        int index = 0;
        //tracks where to place the next digit
        while(n != 0){
            digits[index] = (int) (n % 10);
            //percentage extracts the last digit
            //store the digits in an array
            n /= 10;
            //remove the last digit
            index++;
            //move to next position
        }

        return digits;
    }
}