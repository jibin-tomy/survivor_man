/**
* Write a description of class AbstractMonsterState here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public abstract class AbstractMonsterState implements IMonsterState 
{
    /**
    * Constructor for objects of class AbstractMonsterState
    */
    public AbstractMonsterState(Monster monster)
    {
    this.monster = monster;
    }
    
    protected Monster monster;
}
