/*
-Create an enum TrafficLight with:
    RED - 60 secs
    YELLOW - 5 secs
    GREEN - 45 secs

-Each light should store its duration and expose the method:   
    'int getDuration()'

-Requirements:
1.Use a constructor
2.Fields must be private final
3.Show usage in main

-Enums are basically classes with pre-created objects.
*/


package Notes.Enum;

public enum TrafficLight {
    RED(60),
    //create one TrafficLIght object with duration = 60 and name it 'RED'
    YELLOW(5),
    GREEN(45),

    private final int duration;
    //this duration lives inside each enum instance

    //our constructor
    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    public static void main(String[] args){
        System.out.println(TrafficLight.RED.getDuration());
        System.out.println(TrafficLight.YELLOW.getDuration());
        System.out.println(TrafficLight.GREEN.getDuration());
    }

}
