import greenfoot.*;  
import java.awt.Color;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Command_HighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CommandHighScore  implements MenuCommand
{
    MenuWorld mn ;
      private ReceiverState receiverState;
      private HighScoreKeeper highscorekeeper;
     // private HighScoreWorld hg;
      
    public CommandHighScore()
    {
   // this.receiverState = receiverState;
    }
    @Override
    public void execute() 
    {
        //this.highscorekeeper = new HighScoreKeeper("comming");
       Greenfoot.setWorld(new HighScoreWorld());
        
        
        //setImage(new GreenfootImage("new high score ", 60, Color.WHITE, Color.BLACK));
        
        // Add action code here.
    }  
    
       @Override
    public String getName()
    {
        return "High Score";
    }
    
}
