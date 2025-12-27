/*
Java program to illustrate constructor chaining using the super keyword
-Use super() explicitly when we want to control how the superclass is initialized, 
even when a no-arg constructor exists.
*/
class Base{
    String name;

    //constructor 1
    Base() {
        this("");
        System.out.println("No-argument constructor of" + " base class");
    }

    //constructor 2
    Base(String name){
        this.name = name;
        System.out.println("Calling parametrized constructor" + " of base");
    }

}
class Derived extends Base{
    //constructor 3
    Derived() {
        System.out.println("No argument constructor " + " of derived");
    }

    //parametrized constructor 4
    Derived(String name){
        super(name);
        System.out.println("Calling parametrized " + " constructor of derived");
    }

    public static void main(String args[]) {
        Derived obj = new Derived("test");
    }
}