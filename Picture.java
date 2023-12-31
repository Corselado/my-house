/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square grass;
    private Person kevin;
    private Person person2;

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
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.changeSize(720);
        grass.moveVertical(140);
        grass.moveHorizontal(-310);
        grass.makeVisible();
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-110);
        moon.moveVertical(220);
        moon.changeSize(40);
        moon.makeVisible();
        
        /**Movimiento sol y Luna */
        sun.slowMoveVertical(250);
        moon.slowMoveVertical(-250);
        
    }

    public void amanacer()
    {
        moon.makeInvisible();
        sun.slowMoveVertical(-250);
        
        /**Moviemiento Personas */
        kevin = new Person();
        kevin.moveHorizontal(-250);
        kevin.moveVertical(30);
        kevin.makeVisible();
        kevin.slowMoveHorizontal(120);
        
        person2 = new Person();
        person2.moveHorizontal(300);
        person2.moveVertical(30);
        person2.makeVisible();
        person2.slowMoveHorizontal(-270);
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
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
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
