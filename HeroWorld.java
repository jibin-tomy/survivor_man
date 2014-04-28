import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

public class HeroWorld extends World
{
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    private ScoreKeeper currentScore;
    public HeroWorld() 
    {
        super(12, 12, 60);        
        setBackground("cell.jpg");
        currentScore = new ScoreKeeper();
        addObject(currentScore,0,0);
    }

    /**
     * Populate the world with a fixed scenario of Heros and leaves.
     */    
    public void populate()
    {
        Hero w1;
        w1 = Hero.getInstance();
        addObject(w1, 3, 3);
       
       // Hero w1 = new Hero();
        //addObject(w1, 3, 3);
       
        Wall l1 = new Wall();
        addObject(l1, 5, 3);

        Wall l2 = new Wall();
        addObject(l2, 0, 2);

        Wall l3 = new Wall();
        addObject(l3, 7, 5);

        Wall l4 = new Wall();
        addObject(l4, 2, 6);

        Wall l5 = new Wall();
        addObject(l5, 5, 0);
        
        Wall l6 = new Wall();
        addObject(l6, 4, 7);
        
        Wall l7 = new Wall();
        addObject(l7, 8, 8);
        
       // Monster m1 = new Monster();
        //addObject(m1,6,6);
        
        Food f1 = new Food();
                addObject(f1,6,6);
        Food f2 =new Food();
                addObject(f2,5,7);
        
    }
    
    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Wall Wall = new Wall();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(Wall, x, y);
        }
    }
    public ScoreKeeper getScore()
    {
            return currentScore;
    }
}