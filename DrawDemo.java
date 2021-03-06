import java.awt.Color;
import java.util.Random;

/**
 * @author Carlos Alvarez
 * @version 14/03/2018
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);  
        myCanvas.erase();
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) 
        {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));

            pen.randomSquiggle();
        }
    }

    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }

    /**
     * @param xPos borde lateral izquiero.
     * @param yPos borde superior.
     */
    public void drawTriangle(int xPos, int yPos) {
        Pen pen = new Pen(xPos,yPos,myCanvas);
        pen.setColor(Color.green);

        for(int a = 0; a < 3; a++) 
        {
            pen.move(100);
            pen.turn(-120);
        }
    }

    /**
     * Dibujar un pentagono verde.
     */
    public void drawPentagon() 
    {
        Pen pen = new Pen(210,210,myCanvas);
        pen.setColor(Color.green);

        for(int b = 0; b < 5; b++)
        {
            pen.move(80);
            pen.turn(72);
        }
    }

    /**
     * Dibujar poligono regular
     * @param El numero de lados del poligono.
     */
    public void drawPolygon(int caras)
    {
        Pen pen = new Pen(115,115,myCanvas);

        for(int c = 0; c < caras; c++)
        {
            pen.move(70);
            pen.turn(360/caras);
        }    
    }
    
    /**
     * Dibujar Espirales
     */
    public void drawSpiral() {
       Pen pen = new Pen(25,35,myCanvas);
       int esp = 310;
       for(int e = 1; esp != 5; e++) 
       {
            pen.move(esp);
            pen.turn(90);
            esp -= 5; 
       }
    }
}