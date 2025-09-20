// Parent class
public class Bird {
    public void sing() {
        System.out.println("Singing a generic bird song 🎵");
    }
}

// Subclass 1
class Eagle extends Bird {
    @Override
    public void sing() {
        System.out.println("Screeeeech! 🦅");
    }
    
    public void fly() {
        System.out.println("Eagle flying high! 🚀");
    }
}

// Subclass 2
class Owl extends Bird {
    @Override
    public void sing() {
        System.out.println("Hoot hoot! 🦉");
    }
    
    public void serve() {
        System.out.println("Owl serving wisdom! 📚");
    }
}

// Subclass 3
class Maflingo extends Bird {
    @Override
    public void sing() {
        System.out.println("Fabulous singing! 💅✨");
    }
    
    public void bad() {
        System.out.println("Maflingo slaying! 🔥");
    }
}

// Main class (properly outside Bird)
public class Main {
    public static void main(String[] args) {
        // Hierarchical inheritance in action!
        Bird eagle = new Eagle();
        Bird owl = new Owl();
        Bird maflingo = new Maflingo();
        
        // Polymorphism: Same method, different behaviors
        eagle.sing();   // "Screeeeech! 🦅"
        owl.sing();     // "Hoot hoot! 🦉"
        maflingo.sing(); // "Fabulous singing! 💅✨"
        
        // Subclass-specific methods (need casting)
        ((Eagle) eagle).fly();    // "Eagle flying high! 🚀"
        ((Owl) owl).serve();      // "Owl serving wisdom! 📚"
        ((Maflingo) maflingo).bad(); // "Maflingo slaying! 🔥"
    }
}

//the methods in the parent class are the only ones that can be called in the tester class.
//to change that, use 'override' in the child class and that will be the method that is called, polymorphism bitch.
//the unique methods of a child require casting or usng the child type directly