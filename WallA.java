import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class WallA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallA extends Strategy
{
    private Maze maze;
    public WallA(Maze maze)
    {
    this.maze=maze;
}
    /**
     * Act - do whatever the WallA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void buildMaze()
    {
        
            int l=2;
        for (int y=3;y<28;y+=6){
            for (int z=1; z<7; z++)
            {
            
            for (int x=l;x<l+5;x+=1){
                maze.add(x,y);
            }
            l=l+9;
        }
        l=2;
    }
     
    int i=6;
    for (int k=3; k<50; k+=5){
        for(int z=1;z<5;z++){
        for (int m=i;m<i+2;m++){
            maze.add(k,m);
        }
        i=i+6;
    }
    i=5;
    }
    
}
}
