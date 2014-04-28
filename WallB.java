import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class WallB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallB extends Strategy
{
    private Maze maze;
    public WallB(Maze maze)
    {
    this.maze=maze;
}
    /**
     * Act - do whatever the WallB wants to do. This method is called whenever
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
