import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScoreWorld extends World
{
private MenuWorld menuWorld;
//private MessageBox BackMenu; 

public HighScoreWorld(){
        super(12, 6, 100); 
        setBackground("space.jpg");
        Greenfoot.setWorld(this);
        
        //do add object

        prepare();
    }
    //super(1000, 700, 1); 

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.**/
     
    private void prepare()
    {
        
        addObject(new HighScoreKeeper(""),4,45);
        addObject(new MenuButton(new CommandGameStart()), 4, 4);
        //addObject(new MenuButton(new TestCommand()), 4, 4);
 
        //addObject(new MenuButton(new CommandHighScore()), 4, 4);
          //      addObject(new MenuButton(new CommandGameStart()), 44, 8);
                
    }
}
