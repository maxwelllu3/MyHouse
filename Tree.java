
/**
 * Creates an instance of a Tree.
 *
 * @author Maxwell Lu
 * @version January 17, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square treebase1;
    private Square treebase2;
    private Triangle treehood1;
    private Triangle treehood2;
    private Triangle treehood3;
    private Square treebase3;
    private Square treebase4;
    private Triangle treehood4;
    private Triangle treehood5;
    private Triangle treehood6;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        treebase1 = new Square();
        treebase2 = new Square();
        treehood1 = new Triangle();
        treehood2 = new Triangle();
        treehood3 = new Triangle();
        treebase3 = new Square();
        treebase4 = new Square();
        treehood4 = new Triangle();
        treehood5 = new Triangle();
        treehood6 = new Triangle();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        treebase1.changeColor("brown");
        treebase1.moveVertical(330);
        treebase1.moveHorizontal(-20);
        treebase1.makeVisible();
        
        treebase2.changeColor("brown");
        treebase2.moveVertical(300);
        treebase2.moveHorizontal(-20);
        treebase2.makeVisible();
        
        treehood1.changeColor("green");
        treehood1.moveVertical(310);
        treehood1.moveHorizontal(4);
        treehood1.changeSize(50, 80);
        treehood1.makeVisible();
        
        treehood2.changeColor("green");
        treehood2.moveVertical(280);
        treehood2.moveHorizontal(4);
        treehood2.changeSize(50, 80);
        treehood2.makeVisible();
        
        treehood3.changeColor("green");
        treehood3.moveVertical(250);
        treehood3.moveHorizontal(4);
        treehood3.changeSize(50, 80);
        treehood3.makeVisible();
        
        
        treebase3.changeColor("brown");
        treebase3.moveVertical(330);
        treebase3.moveHorizontal(60);
        treebase3.makeVisible();
        
        treebase4.changeColor("brown");
        treebase4.moveVertical(300);
        treebase4.moveHorizontal(60);
        treebase4.makeVisible();
        
        treehood4.changeColor("green");
        treehood4.moveVertical(310);
        treehood4.moveHorizontal(84);
        treehood4.changeSize(50, 80);
        treehood4.makeVisible();
        
        treehood5.changeColor("green");
        treehood5.moveVertical(280);
        treehood5.moveHorizontal(84);
        treehood5.changeSize(50, 80);
        treehood5.makeVisible();
        
        treehood6.changeColor("green");
        treehood6.moveVertical(250);
        treehood6.moveHorizontal(84);
        treehood6.changeSize(50, 80);
        treehood6.makeVisible();
        // translate the tree to the specified location
        
        
    }
    
}