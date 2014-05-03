import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class LevelChange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelChange extends Actor
{
    /**
     * Act - do whatever the LevelChange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
     if(getWorld().getObjects(Food.class).size()==0){ 
          Maze maze = new Maze(); 
          Strategy S=new WallA(maze);
          maze.changeStrategy(S);
          
      Greenfoot.setWorld(maze);
        
         maze.populate();
           
        }
}}
