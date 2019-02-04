
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square win;
    private Square treetrunk;
    private Triangle tree;
    private Square garage;
    private Square gardoor;
    
    
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        //wall.changeColor("purple");

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(0);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        treetrunk = new Square();
        treetrunk.changeColor("Brown");
        treetrunk.makeVisible();
        treetrunk.moveHorizontal(125);
        treetrunk.moveVertical(160);
        
        tree =new Triangle ();
        tree.changeColor("green");
        tree.moveHorizontal(150);
        tree.moveVertical(45);
        tree.changeSize(150, 50);
        tree.makeVisible();
        
        win = new Square();
        win.changeColor("black");
        win.moveHorizontal(60);
        win.moveVertical(100);
        win.makeVisible();
        
        garage = new Square();
        garage.changeColor("blue");
        garage.makeVisible();
        garage.changeSize(60);
        garage.moveVertical (120);
        garage.moveHorizontal(-55);
        
        gardoor =new Square();
        gardoor.changeColor("black");
        gardoor.moveHorizontal(-40);
        gardoor.moveVertical(148);
        gardoor.makeVisible();
        
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("blue");
            sun.changeColor("yellow");
            treetrunk.changeColor("brown");
            tree.changeColor("green");
            //door.changeColor("black");
        }
    }

}
