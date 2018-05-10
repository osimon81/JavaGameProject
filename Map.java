import java.util.Scanner;
/**
 * Write a description of class Map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Map
{   
    private int xPos;
    private int xPlus;
    private int xMinus;
    
    private int yPos;
    private int yPlus;
    private int yMinus;
    
    private int zPos;
    private int zPlus;
    private int zMinus;
    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        Scanner scan = new Scanner(System.in);
        
        
        xPos = 50;
        yPos = 50;
        zPos = 0;
        
        xPlus = 100;
        xMinus = -100;
        
        yPlus = 100;
        yMinus = -100;
        
        zPlus = 20;
        zMinus = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void inStandby()
    {
        System.out.print(">> ");
        Scanner scan = new Scanner(System.in);
        String response = scan.next();
        if (response.equals("forward")) {
            updatePosition("forward");
            inStandby();
        }
        else if (response.equals("back")) {
            updatePosition("back");
            inStandby();
        }
        else if (response.equals("left")) {
            updatePosition("left");
            inStandby();
        }
        else if (response.equals("right")) {
            updatePosition("right");
            inStandby();
        }
        else if (response.equals("up")) {
            updatePosition("up");
            inStandby();
        }
        else if (response.equals("down")) {
            updatePosition("down");
            inStandby();
        }
        else if (response.equals("position")) {
            displayPosition();
            inStandby();
        }
        else if (response.equals("leave")) {
            System.exit(0);
        }
        else {
            System.out.println("Invalid command. Please try again.");
            inStandby();
        }
    }
    
    private void updatePosition(String direction)
    {
        if (direction.equals("forward")) {
            if ((yPos + 1) <= yPlus) {
                yPos = yPos + 1;
                displayPosition();
            }
            else if ((yPos + 1) > yPlus) {
                System.out.println("You cannot move any further forward.");
            }
        }
        else if (direction.equals("back")) {
            if ((yPos - 1) >= yMinus) {
                yPos = yPos - 1;
                displayPosition();
            }
            else if ((yPos- 1) < yMinus) {
                System.out.println("You cannot move any further backward.");
                displayPosition();
            }
        }
        else if (direction.equals("left")) {
            if ((xPos - 1) >= xMinus) {
                xPos = xPos - 1;
                displayPosition();
            }
            else if ((xPos - 1) < xMinus) {
                System.out.println("You cannot move any further left.");
                displayPosition();
            }
        }
        else if (direction.equals("right")) {
            if ((xPos + 1) <= xPlus) {
                xPos = xPos + 1;
                displayPosition();
            }
            else if (xPos + 1 > xPlus) {
                System.out.println("You cannot move any further forward.");
            }
        }
        else if (direction.equals("up")) {
            if ((zPos + 1) <= zPlus) {
                zPos = zPos + 1;
                displayPosition();
            }
            else if ((zPos + 1) > zPlus) {
                System.out.println("You cannot move any further up.");
            }
        }
        else if (direction.equals("down")) {
            if ((zPos - 1) >= zMinus) {
                zPos = zPos - 1;
                displayPosition();
            }
            else if ((zPos - 1) < zMinus) {
                System.out.println("You cannot move any further down.");
                displayPosition();
            }
        }
    }
    
    private void placeHouse(int x1, int x2, int y1, int y2, int z1, int z2, String name)
    {
        
    }
    
    private void displayPosition() {
        System.out.println("You are at X:" + xPos + ", Y:" + yPos + ", Z:" + zPos + ".");
    }
}
