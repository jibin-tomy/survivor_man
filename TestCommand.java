import greenfoot.*;
/**
 * Write a description of class TestCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCommand implements Command 
{
    @Override
    public String getName()
    {
        return "Test";
    }
    
    @Override
    public void execute()
    {
        Greenfoot.setWorld(new Maze());
    }
}
