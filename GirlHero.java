import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GirlHero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GirlHero extends HeroProd
{
   GirlHero()
   {
       super(HeroType.GIRL);
       construct();
    }
    protected void construct()
    {
        setImage("images/girl1.png");
    }
}
