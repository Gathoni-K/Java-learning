/*
-Given an integer, N, print its first 10 multiples
-Each multiple N * i (where 1<= i <= 10) should be printed on a new line 
in the form: 'N * i = result'

Sample input: 2
Sample output:
    2 x 1 = 2
    2 x 2 = 4
    2 x 3 = 6
    2 x 4 = 8
    2 x 5 = 10
    2 x 6 = 12
    2 x 7 = 14
    2 x 8 = 16
    2 x 9 = 18
    2 x 10 = 20

*/
package logicgym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Loops {

    public static void main(String[]args) throws IOException {
        // 'throws IOException' tells Java, if something goes wrong, crash politely.
        BufferedReader
        bufferedReader = new
        BufferedReader(new InputStreamReader(System.in));

        /*
        -BufferedReader is a tool for reading input from the keyboard efficiently.
        System.in - raw keyboard input, very low level
        InputStreamReader - converts bytes to characters
        BufferedReader - reads full lines efficiently.

        -The above lines of code are just for getting clean, fast input.
        */

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        /*
        -Creates a var N of type integer and its value is the number read from the user
        readLine() - reads a line as a string
        trim() - removes extra spaces
        Integer.parseInt() - converts a string to an integer
        */

        // bufferedReader.close();
        //this closes the input stream and frees memory

        /*
        Upto here our program reads a number,stores it in N
         */

        int c = 1;
        //our starting point
        while (c <= 10) {
            int result = N * c;
            System.out.println(N + " x " + c + " = " + result);
            c ++;
            
        }

    }
    
}
