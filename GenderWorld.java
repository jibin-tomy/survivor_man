import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenderWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenderWorld extends World
{

    /**
     * Constructor for objects of class GenderWorld.
     * 
     */
    public GenderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(600, 400, 1); 
         super(12, 6, 100); 
        setBackground("space.jpg");
        Greenfoot.setWorld(this);
        
        //do add object

        prepare();
    }
   public void  prepare(){
    addObject(new GenderMenuButton(new CommandBoy()), 4, 4);
                addObject(new GenderMenuButton(new CommandGirl()), 4, 18);
            }
}
