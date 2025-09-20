public class person {
    public void sing(){
        System.out.println("Singing");
    }
class teacher extends person{
    public void sing(){
        System.out.println("The teacher");
    }
} 
class student extends person{
    public void sing(){
        System.out.println("The student");
    }
}
class customer extends person{
    public void sing(){
        System.out.println("The customer");
    }
}
class man{
    public static void main(String[] args) {
        person p = new person();
        p.sing();
    }}
}

