import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Command_Game_Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CommandGameStart implements MenuCommand
{
  
    private ReceiverState receiverState;
    private GenderWorld genderWorld ;
    public CommandGameStart()
    {
    //this.receiverState = receiverState;
    }
    @Override
    public void execute() 
    {
       
       // System.out.println("comming to CommandGame");
       genderWorld = new GenderWorld();
       

        // Add your action code here.
    }
  
       @Override
    public String getName()
    {
        return "Start Game";
    }
    
    
}
