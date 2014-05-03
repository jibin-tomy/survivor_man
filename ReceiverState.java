import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receiver_State here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverState extends Actor
{
    private MenuWorld menuWorld;
        private Maze maze;
        private HighScoreKeeper highscore;
    /**
     * Act - do whatever the Receiver_State wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void GameStart()
    {
    Greenfoot.setWorld(maze);
    }
     public void HighScore()
    {
       // maze.high();
//this.menuWorld.setState(this.menuWorld.getHighScoreKeeperState());
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
