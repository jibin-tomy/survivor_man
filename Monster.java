import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
* Write a description of class Monster here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Monster extends Moveable
{
    /**
    * Act - do whatever the Monster wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {
        state.move();
        if (onHero())
        {
            fight();
        }
    } 
    
    public Monster()
    {
        setDirection(Moveable.EAST);
        setImage("images/ant3.png");
        heroNotFoundState = new HeroNotFoundState(this);
        heroFoundState = new HeroFoundState(this);
        state = heroNotFoundState;
    }
    
    @Override
    public void die()
    {
        getWorld().removeObject(this);
    }
    
    public boolean onHero()
    {
        if (getWorld().getObjects(Hero.class).size() != 0)
        {
            Hero hero = (Hero) getWorld().getObjects(Hero.class).get(0);
            int heroX = hero.getX();
            int heroY = hero.getY();
            int myX = getX();
            int myY = getY();
            return heroX == myX && heroY == myY; 
        }
        return false;
    }
    
    public void fight()
    {
        if(onHero())
        {
            Hero hero = (Hero) getWorld().getObjects(Hero.class).get(0);
            hero.setLife(hero.getLife() - DAMAGE);
        }
    }
    
    public void setState(MonsterStates nextState)
    {
        switch( nextState )
        {
            case HERO_FOUND : state = heroFoundState; break;
            case HERO_NOT_FOUND : state = heroNotFoundState; break;
        }
    }
    
    protected boolean isHeroNear()
    {
        return (getObjectsInRange(RADIUS, Hero.class).size() != 0);
    }
    
    private IMonsterState state;
    private IMonsterState heroFoundState;
    private IMonsterState heroNotFoundState;
    private static int DAMAGE = 1;
    private static int RADIUS = 6;
}