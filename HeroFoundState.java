import java.util.Random;
/**
* Write a description of class RandomWalk here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class HeroFoundState extends AbstractMonsterState
{
    public HeroFoundState(Monster monster)
    {
        super(monster);
    }
    @Override
    public void move()
    {
        if (!monster.isHeroNear())
        {
            monster.setState(MonsterStates.HERO_NOT_FOUND);
        }
        else
        {
 
            Hero hero = Hero.getInstance();
            int heroX = hero.getX();
            int heroY = hero.getY();
            int myX = monster.getX();
            int myY = monster.getY();
            
            if (heroX - myX > 0) //East
            {
                monster.setDirection(Moveable.EAST);
            }
            else if(heroX - myX < 0)
            {
                monster.setDirection(Moveable.WEST);
            }
            if (heroX - myX != 0 && monster.canMove())
            {
                monster.move();
                return;
            }
            
            if (heroY - myY > 0) //SOUTH
            {
                monster.setDirection(Moveable.SOUTH);
            }
            else if(heroY - myY < 0)
            {
                monster.setDirection(Moveable.NORTH); 
            }
            if (heroY - myY != 0 && monster.canMove())
            {
                monster.move();
                return;
            }

        }
    }
}
