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
    private Square sky;
    private Square field;
    private Square base;
    private Square chimney1;
    private Square chimney2;
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
        sky = new Square();
        field = new Square();
        base = new Square();
        chimney1 = new Square();
        chimney2 = new Square();
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
        
        //Set up the sky
        sky.changeColor("blue");
        sky.changeSize(600);
        sky.moveUp();
        sky.moveUp();
        sky.moveUp();
        sky.moveLeft();
        sky.moveLeft();
        sky.moveLeft();
        sky.makeVisible();
        
        //Set up the field
        field.changeColor("green");
        field.changeSize(600);
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveDown();
        field.moveLeft();
        field.moveLeft();
        field.moveLeft();
        field.makeVisible();
        
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
        base.moveRight();
        base.moveRight();
        base.moveRight();
        
        //Set up the chimney
        chimney1.changeColor("black");
        chimney1.makeVisible();
        chimney1.moveVertical(100);
        chimney1.moveHorizontal(300);
        chimney2.changeColor("black");
        chimney2.makeVisible();
        chimney2.moveVertical(90);
        chimney2.moveHorizontal(300);
        
        
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
        hood.moveRight();
        hood.moveRight();
        hood.moveRight();
        
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
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveRight();
        doorknob.moveVertical(10);
    }
}
