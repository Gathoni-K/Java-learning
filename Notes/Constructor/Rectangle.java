/*
-Class Rectangle with fields length and width.

-Provide 3 constructors:
1.No args, length and width set to 0.
2.One arg -  sets both length and width to the same value
3.Two args - sets length and width individually.

*/

package Notes.Constructor;

public class Rectangle {
    int length;
    int width;

    //our primary constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        this(0, 0);
        //sets our length and width to 0
    }
    public Rectangle(int width) {
        this(width, width);
    }

    @Override
    public String toString(){
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3);
        Rectangle r3 = new Rectangle(4,7);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }
    
}
