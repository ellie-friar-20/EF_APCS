import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    World world = new World(220, 220);
    //Instantiate a turtle. Name it as you wish.
    Turtle clartle = new Turtle(world);
    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
    
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */
    clartle.penDown();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.turnRight();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnRight();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnLeft();
    clartle.forward();
    clartle.turnRight();
    clartle.forward();
    clartle.turnRight();
    clartle.forward();


    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
    world.show(true);
  }
}
