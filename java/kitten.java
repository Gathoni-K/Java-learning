public class kitten extends Cat{
    
    public kitten (String name){
        super(name, 0, "gray");
    }


    @Override
    public void meow(){
        System.out.println("Squeak! I am a baby cat!");
    }
    private void play(){
        System.out.println(name + "is playing with the ball");
    }

public static void main(String[]args){
    kitten k = new kitten("Whiskers");
    System.out.println(k.name);
    k.meow();
    k.play();


}
}