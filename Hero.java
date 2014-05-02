import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.List;
import java.util.ArrayList;

/**
 * Hero. A Hero moves forward until it can't do so anymore, at
 * which point it turns left. If a Hero finds a Wall, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Hero extends Actor
{
     public static HeroProd herotype(HeroType type)
        {
            HeroProd hmodel = null;
            switch(type)
            {
                case BOY:
                hmodel = new BoyHero();
                break;
                case GIRL:
                hmodel = new GirlHero();
                break;
            }
            return hmodel;
        }
    
    

     
}
    