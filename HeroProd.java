import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroProd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class HeroProd extends Moveable
{
    public HeroProd(HeroType type)
    {
        this.type = type;
       // setDirection(Moveable.EAST);
    }
     protected abstract void construct();
     private HeroType type = null;
     
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
        if(isOn(Food.class))
        {
            acquire(Food.class);
        }
    }
    
    public boolean isOn(Class sm)
    {
        Actor actor = getOneIntersectingObject(sm);
        return actor != null;
    }
    //@Override
    public void die()
    {
        // getWorld().removeObject(actor);
    }
     public void acquire(Class sm)
     {
            Actor actor = getOneObjectAtOffset(0,0,sm);
            if(actor != null)
            {
                   
                    getWorld().removeObject(actor);
            }
             HeroWorld hw = (HeroWorld) getWorld();    
                    ScoreKeeper score = hw.getScore();
            
                    if(sm == Food.class)
                    {
                        score.update(10);
                    }

            
                
      }
}
