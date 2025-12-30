/*
-Create a method called  multiply that:
1.takes 2 integers as params.
2.returns their product
3.calls it from main and prints the result

*/



package Notes.Methods;

public class Multiply {
    
    public static int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        int result = multiply(5, 6);
        System.out.println("Product: " + result);
    }
}
