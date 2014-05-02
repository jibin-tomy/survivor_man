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
public abstract class HeroProduct extends Moveable
{
    public HeroProduct(HeroType type)
    {
        this.type = type;
        setDirection(Moveable.EAST);
    }

      protected abstract void construct();
      private HeroType type = null;
}
    