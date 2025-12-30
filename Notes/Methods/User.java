/*
-Create a method called greetUser that:
1.takes no params.
2.Prints a message to the console.
3.call it from main
*/

package Notes.Methods;

public class User {
    
    //as our method only prints a string, its return type should be void
    //method definition
    public static void greetUser(){
        System.out.println("Filthy monkey who can't even use Jujutsu");
    }
    
    //main is void, does not return any value.
    public static void main(String[] args){
    greetUser();
    }
    
}
