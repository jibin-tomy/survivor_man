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
     private ScoreKeeper currentScore;
    /**
     * Constructor for objects of class Maze.
     * 
     */
    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(55, 30, 20);        
        setBackground("space1.jpg");
        S=new WallB(this);
        currentScore = new ScoreKeeper();
        addObject(currentScore,0,0);
    }
    
    public void populate()
    {
        this.S.buildMaze();
        
        for(int i=0;i<13;i++){
        int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
        
        Food f1 = new Food();
                addObject(f1,x,y);
        Food f2 =new Food();
                addObject(f2,x,y);
            }
            
         for(int i=0;i<10;i++){
        int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
        
        Monster m=new Monster();
        addObject(m,x,y);
        
    }
       addObject(Hero.getInstance(),25,14);
       
    }
    
    void add(int x, int y)
    {
        addObject(new Wall(),x,y);
    }
    
    void changeStrategy(Strategy S)
    {
        this.S=S;
    }
    
    public ScoreKeeper getScore()
    {
            return currentScore;
    }
    
   
}
