public class trafficlight {
    private String color;
    private int duration;

public trafficlight(String initialColor, int initialDuration){
    this.color = initialColor;
    this.duration = initialDuration;
}
public void changeColor(String newColor, int newDuration){
    this.color = newColor;
    this.duration = newDuration;
}
public boolean isRed(){
    return color.equalsIgnoreCase("red");
}
public boolean isGreen(){
    return color.equalsIgnoreCase("green");
}

}
