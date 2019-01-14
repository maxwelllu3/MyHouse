/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window
{
    // instance variables - replace the example below with your own
    private Square pane1;
    private Square pane2;
    private Square pane3;
    private Square pane4;
    private Square pane5;
    private Square pane6;
    private Square pane7;
    private Square pane8;

    /**
     * Constructor for objects of class Window
     */
    public Window()
    {
        // initialise instance variables
        pane1 = new Square();
        pane2 = new Square();
        pane3 = new Square();
        pane4 = new Square();
        pane5 = new Square();
        pane6 = new Square();
        pane7 = new Square();
        pane8 = new Square();
    }

    /**
     * drawWindow
     */
    public void drawWindow()
    {
        // put your code here
        pane1.changeSize(12);
        pane1.changeColor("yellow");
        pane1.makeVisible();
        pane1.moveVertical(200);
        pane1.moveHorizontal(200);
        
        pane2.changeSize(12);
        pane2.changeColor("yellow");
        pane2.makeVisible();
        pane2.moveVertical(200);
        pane2.moveHorizontal(214);
        
        pane3.changeSize(12);
        pane3.changeColor("yellow");
        pane3.makeVisible();
        pane3.moveVertical(214);
        pane3.moveHorizontal(200);
        
        pane4.changeSize(12);
        pane4.changeColor("yellow");
        pane4.makeVisible();
        pane4.moveVertical(214);
        pane4.moveHorizontal(214);
        
        pane5.changeSize(12);
        pane5.changeColor("yellow");
        pane5.makeVisible();
        pane5.moveVertical(200);
        pane5.moveHorizontal(300);
        
        pane6.changeSize(12);
        pane6.changeColor("yellow");
        pane6.makeVisible();
        pane6.moveVertical(200);
        pane6.moveHorizontal(314);
        
        pane7.changeSize(12);
        pane7.changeColor("yellow");
        pane7.makeVisible();
        pane7.moveVertical(214);
        pane7.moveHorizontal(300);
        
        pane8.changeSize(12);
        pane8.changeColor("yellow");
        pane8.makeVisible();
        pane8.moveVertical(214);
        pane8.moveHorizontal(314);
    }
}
