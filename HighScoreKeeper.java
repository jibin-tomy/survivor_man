import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class HighScoreKeeper extends Actor implements Score
{
  private int totalcount = 0;
  private  int high =0;
    public HighScoreKeeper(String text)
    {
        setImage(new GreenfootImage(text, 30, Color.WHITE, Color.BLACK));
        high();
        //setImage(new GreenfootImage(text, 10, Color.WHITE, Color.BLACK));
    }
    public void update(int count)
   {
       highCount(count);
    }
    public void highCount(int highscore)
    {
        if(totalcount>highscore)
        {
        setImage(new GreenfootImage("new high score " + totalcount, 10, Color.WHITE, Color.BLACK));
        highscore = totalcount;
        high = highscore;
    }
    
}
public void high ()
{
setImage(new GreenfootImage("new high score " + high, 30, Color.WHITE, Color.BLACK));
}
}
