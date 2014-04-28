import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze extends World
{
    private Strategy S;
    /**
     * Constructor for objects of class Maze.
     * 
     */
    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(55, 30, 20);        
        setBackground("cell.jpg");
        S=new WallA(this);
        
    }
    
    public void populate()
    {
        this.S.buildMaze();
    }
    
    void add(int x, int y)
    {
        addObject(new Wall(),x,y);
    }
    
    void changeStrategy(Strategy S)
    {
        this.S=S;
    }
    
}
