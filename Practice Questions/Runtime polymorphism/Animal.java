// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child classes
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos: Moo!");
    }
}

public class Main {
    public static void main(String[] args) {

        // Upcasting: parent reference → child object
        Animal a1 = new Dog();   // Dog object
        Animal a2 = new Cat();   // Cat object
        Animal a3 = new Cow();   // Cow object

        // Method resolved at RUNTIME based on actual object
        a1.sound();  // Output: Dog barks: Woof!
        a2.sound();  // Output: Cat meows: Meow!
        a3.sound();  // Output: Cow moos: Moo!
    }
}