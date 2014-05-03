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
public abstract class Hero extends Moveable
{
    private static Hero heroinstance;
    protected Hero()
    {
                setDirection(Moveable.EAST);
                setImage(getHeroImage());
                heroinstance = this;
    }

    public static Hero getInstance()
    {/*
    if (heroinstance == null)
        heroinstance = new Hero();*/
    return heroinstance;
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
        if(isOn(Grape.class))
        {
            acquire(Grape.class);
        }else if(isOn(Banana.class))
        {
            acquire(Banana.class);
        }else if(isOn(Cherrie.class))
        {
            acquire(Cherrie.class);
        }
    }
    
    public boolean isOn(Class sm)
    {
        Actor actor = getOneIntersectingObject(sm);
        return actor != null;
    }
    @Override
    public void die()
    {
        MenuWorld mn = new MenuWorld();
       getWorld().removeObject(this); 
       Greenfoot.setWorld(mn);
    }
     public void acquire(Class sm)
     {
            Actor actor = getOneObjectAtOffset(0,0,sm);
            if(actor != null)
            {
                   
                    getWorld().removeObject(actor);
            }
             Maze hw = (Maze) getWorld();    
                    ScoreKeeper score = hw.getScore();
            
                    if(sm == Grape.class)
                    {
                        score.update(10);
                    }else  if(sm == Banana.class)
                    {
                        score.update(20);
                    }else  if(sm == Cherrie.class)
                    {
                        score.update(30);
                    }

            
                
      }
      
     abstract public GreenfootImage getHeroImage();
}
    