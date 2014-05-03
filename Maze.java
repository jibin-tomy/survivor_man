import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
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
     private static String gender;
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
        addObject(currentScore,1,0);
        
    }
    
    public static void setHero(String input)
    {
        gender=input;
    }
    
    
    public void populate()
    {
        this.S.buildMaze();
        
        LevelChange l=new LevelChange();
        addObject(l,2,0);
        
        for(int i=0;i<1;i++){
        int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
       
        Food f2 =new Banana();
                addObject(f2,x,y);
            }
            
          for(int i=0;i<1;i++){
        int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
       
        Food f1 =new Grape();
                addObject(f1,x,y);
            }
            
            for(int i=0;i<1;i++){
        int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
       
        Food f3 =new Cherrie();
                addObject(f3,x,y);
            }
            
         for(int i=0;i<1;i++){
        int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
        
        Monster m=new Monster();
        addObject(m,x,y);
        
    }
    
    BoyHero h1 = new BoyHero();
    GirlHero g1 = new GirlHero();
    if(gender.equals("BOY"))
    {
       h1.getHeroImage();
       addObject(h1,25,15);  
    }
       else if(gender.equals("GIRL"))
       {
       g1.getHeroImage();
       addObject(g1,25,15);  
    }
     
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
