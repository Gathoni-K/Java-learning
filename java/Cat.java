public class Cat{
    public String name;
    public String color;
    private int age;

    public void get_age(){

    }
    public void have_birthday(){
        
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

public void meow(){
    System.out.println("Meow! My name is" + name);
}
}

class Cattester{
    public static void main(String[]args){
        Cat p = new Cat ("Fluffy", 3, "white");
        System.out.println(p.name);
        System.out.println(p.color);
        System.out.println(p.age);
    }
}
