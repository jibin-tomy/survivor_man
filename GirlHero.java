import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoyHero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GirlHero extends Hero
{
    @Override
    public GreenfootImage getHeroImage()
    {
        return new GirlImage();
    }
}
