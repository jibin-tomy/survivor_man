import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoyHero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoyHero extends HeroProd
{
     BoyHero()
   {
       super(HeroType.BOY);
       construct();
    }
    protected void construct()
    {
        setImage("images/boy1.png");
    }  
}
