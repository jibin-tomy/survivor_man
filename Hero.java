import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.List;
import java.util.ArrayList;

/**
 * Hero. A Hero moves forward until it can't do so anymore, at
 * which point it turns left. If a Hero finds a Wall, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Hero extends Moveable
{
    
    public Hero()
    {
        setDirection(Moveable.EAST);
    }

    /**
     * Do whatever the Hero likes to to just now.
     */
    public void act()
    {
        
 
   
         if(Greenfoot.isKeyDown("left") )
        {
            setDirection(Moveable.WEST);
        }   
        else if(Greenfoot.isKeyDown("right") )
        {
            setDirection(Moveable.EAST);
            //move();
        }
        else if(Greenfoot.isKeyDown("up") )
        {
            setDirection(Moveable.NORTH);
            
        }
        else if(Greenfoot.isKeyDown("down") )
        {
            setDirection(Moveable.SOUTH);
            
        }
        
        if(canMove())
        {
              move();      
        }
        
    }
    
    @Override
    public void die()
    {
        //TODO
    }
}
    