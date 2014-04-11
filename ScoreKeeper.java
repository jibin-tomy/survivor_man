import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ScoreKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreKeeper extends Actor
{
   private int totalcount = 0;
    public ScoreKeeper(String text)
    {
        setImage(new GreenfootImage(text, 10, Color.WHITE, Color.BLACK));
    }
    
    public ScoreKeeper()
    {
        setImage(new GreenfootImage("0", 10, Color.WHITE, Color.BLACK));
    }

    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void bumpCount(int count)
    {
        totalcount += count;
        setImage(new GreenfootImage("" + totalcount, 10, Color.WHITE, Color.BLACK));
    }
    
    public void highCount(int highscore)
    {
        if(totalcount>highscore)
        {
        setImage(new GreenfootImage("new high score " + totalcount, 10, Color.WHITE, Color.BLACK));
        highscore = totalcount;
    }
    
    }
}
