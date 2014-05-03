import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CommandGirl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommandGirl  implements MenuCommand
{
    private Maze maze ;
    BoyHero h1 = new BoyHero();
    GirlHero g1 = new GirlHero();
    /**
     * Act - do whatever the CommandMale wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void execute() 
    {
       
    maze = new Maze(); 
      String gender="GIRL";
       Greenfoot.setWorld(maze);
         Maze.setHero(gender);
         maze.populate();
         
        // Add your action code here.
    }
  
       @Override
    public String getName()
    {
        return "Girl";
    }
}
