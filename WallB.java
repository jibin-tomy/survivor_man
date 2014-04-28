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
     
     
    int i=2;
    for (int k=3; k<50; k+=10){
        for(int z=1;z<5;z++){
        for (int m=i;m<i+4;m++){
            maze.add(k,m);
        }
        i=i+7;
    }
    i=2;
    }
    
          int l=7;
        for (int y=3;y<28;y+=4){
            for (int z=1; z<7; z++)
            {
            
            for (int x=l;x<l+3;x+=1){
                maze.add(x,y);
            }
            l=l+10;
        }
        l=7;
    } 
    
    }
}
