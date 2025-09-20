///*
/// multilevel inheritance */

public class Vehicle{
    public void drive(){
        System.out.println("Drivers");
    }
}
class BMW extends Vehicle{
    public void machine(){
        System.out.println("za German machine!!");
    }
}
class M4 extenda BMW{
    public void speed(){
        System.out.println("Speed");
    }
}
