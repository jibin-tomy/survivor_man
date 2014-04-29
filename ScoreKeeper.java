import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ScoreKeeper extends Actor implements Score 
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
    public void update(int count)
    {
        bumpCount(count);
    }
    public void bumpCount(int count)
        {
            totalcount += count;
            setImage(new GreenfootImage("" + totalcount, 10, Color.WHITE, Color.BLACK));
           
        }
}
 