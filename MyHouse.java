
/**
 * Creates an image of a house.
 *
 * @author Maxwell B. Lu
 * @version Jan. 11, 2019
 */
public class MyHouse
{
    // Fields a.k.a.
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Square base;
    private Triangle hood;
    private Square doorhalf1;
    private Square doorhalf2;
    private Circle doorknob;

    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        hood = new Triangle();
        doorhalf1 = new Square();
        doorhalf2 = new Square();
        doorknob = new Circle();
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void drawHouse()
    {
        // Arrange each object
        
        //Set up the base
        base.makeVisible();
        base.changeSize(200);
        base.changeColor("black");
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveRight();
        base.moveRight();
        base.moveRight();
        base.moveRight();
        base.moveRight();
        
        //Set up the hood
        hood.makeVisible();
        hood.changeSize(100,250);
        hood.changeColor("red");
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        hood.moveDown();
        hood.moveDown();
        hood.moveDown();
        hood.moveDown();
        hood.moveDown();
        hood.moveHorizontal(10);
        
        //Set up the doorhalf1
        doorhalf1.makeVisible();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveDown();
        doorhalf1.moveRight();
        doorhalf1.moveRight();
        doorhalf1.moveRight();
        doorhalf1.moveRight();
        doorhalf1.moveRight();
        doorhalf1.moveRight();
        doorhalf1.changeColor("yellow");
        
        //Set up the doorhalf2
        doorhalf2.makeVisible();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveDown();
        doorhalf2.moveRight();
        doorhalf2.moveRight();
        doorhalf2.moveRight();
        doorhalf2.moveRight();
        doorhalf2.moveRight();
        doorhalf2.moveRight();
        doorhalf2.changeColor("yellow");
        
        //Set up the doorknob
        doorknob.makeVisible();
        doorknob.changeSize(5);
        doorknob.changeColor("black");
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveDown();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveVertical(10);
    }
}
