import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Moveable
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Hero hero = (Hero) getWorld().getObjects(Hero.class).get(0);
        int heroX = hero.getX();
        int heroY = hero.getY();
        
        int myX = getX();
        int myY = getY();
        
        if (heroX - myX > 0) //East
        {
            setDirection(Moveable.EAST);
            
        }
        else if(heroX - myX < 0)
            setDirection(Moveable.WEST);
        if (heroX - myX != 0 && canMove())
        {
            move();
            return;
        }
        
        if (heroY - myY > 0) //SOUTH
        {
            setDirection(Moveable.SOUTH);
            
        }
        else if(heroY - myY < 0)
            setDirection(Moveable.NORTH); 
        if (heroY - myY != 0 && canMove())
        {
            move();
            return;
        }
        
        //move();
    }    
    
    public Monster()
    {
        setDirection(Moveable.EAST);
        setImage("images/monster.png");
    }
}
