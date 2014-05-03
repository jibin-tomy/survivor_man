import greenfoot.*; 
import java.awt.Color;
import java.awt.Font; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenderMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenderMenuButton extends Actor
{
    /**
     * Act - do whatever the GenderMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public GenderMenuButton(MenuCommand cmd){
        this.cmd = cmd;
      
        setImage(new GreenfootImage(cmd.getName(), 40, Color.RED, Color.BLUE));
        act();
    }
    public void act() 
    {
        /*
        viewHighScoreLabel = new MessageBox("./images/fingerprint.jpg", 160, 30);
        viewHighScoreLabel.setMsgLocation(20, 21);
        viewHighScoreLabel.setFontColor(Color.RED);
        viewHighScoreLabel.displayMessage("View High Score", 18);
        this.menuWorld.addObject(viewHighScoreLabel, 850, 43) ;
        // Add your action code here.
             viewGamestart1 = new MessageBox("./images/fingerprint.jpg", 160, 30);
        viewGamestart1.setMsgLocation(20, 21);
        viewGamestart1.setFontColor(Color.RED);
        viewGamestart1.displayMessage("Start", 18);
        this.menuWorld.addObject(viewGamestart1, 450, 43) ;
        */
       if (Greenfoot.mousePressed(this)){

        cmd.execute();
    }
    }   
    
private     MenuCommand cmd;
}