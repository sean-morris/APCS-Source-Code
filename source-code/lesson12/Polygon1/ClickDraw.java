import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

// This program accepts clicks and draws them connected by lines.
public class ClickDraw extends JPanel implements MouseListener {

    private int myWindowWidth = 700;
    private int myWindowHeight = 500;
    private int countClose = 0;
    // a) Declaration and Initialization of an ArrayList of Point objects goes here.
    

    public ClickDraw ( ) {
        
        JFrame easel = new JFrame();      
        easel.setSize (myWindowWidth, myWindowHeight);
        easel.add (this);
        addMouseListener (this);
        easel.setVisible (true);
    }
    
    public void mouseClicked (MouseEvent event) {
        Point p = new Point (event.getX ( ), event.getY ( ));
        if(!clearPoints(p)){
        // b) Adding the point to the ArrayList goes here.
         
        }
        repaint ( );
    }
    
    private boolean closeTo (Point p1, Point p2) {
        return Math.abs (p1.x - p2.x) < 3 && Math.abs (p1.y-p2.y) < 3;
    }
       
    public void paintComponent (Graphics g) {
        // The following 3 lines erase the display, ...
        g.setColor (Color.white);
        g.fillRect (0, 0, myWindowWidth, myWindowHeight);
        g.setColor (Color.black);
        // c) then redraw it (code goes here).
        int x = 0;
        while(x < points.size()){
            Point p = //...
            g.fillOval (p.x-5, p.y-5, 10, 10);
           //....
        }
    }
    
    private boolean clearPoints(Point p)
    {
        // d) This method should remove all the points from the ArrayList
        //    if the user clicks the same point(or closeTo) 3 times
        //    It should return true if the points were removed, otherwise false
      
        
        
    }
    public void mouseReleased (MouseEvent event) {
    }
    
    public void mousePressed (MouseEvent event) {
    }
    
    public void mouseEntered (MouseEvent event) {
    }
    
    public void mouseExited (MouseEvent event) {
    }
}
