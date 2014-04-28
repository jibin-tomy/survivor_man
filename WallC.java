import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class WallC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallC extends Strategy
{
     private Maze maze;
    public WallC(Maze maze)
    {
    this.maze=maze;
}
    /**
     * Act - do whatever the WallC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
    
    
    public void buildMaze()
    {
        for (int y = 4/2+10; y<24*5; y+=5) {
            for (int x = 4/2; x<19*5; x+=5) {
                maze.add(x,y);
            }
        }
    }
}
