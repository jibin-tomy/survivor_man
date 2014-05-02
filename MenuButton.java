import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Actor
{
    public MenuButton(Command cmd)
    {
        this.cmd = cmd;
        setImage(new GreenfootImage(cmd.getName(), 20, null, null));
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            cmd.execute();
        }
    }
    private Command cmd;
}
