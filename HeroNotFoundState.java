import java.util.Random;
/**
* Write a description of class RandomWalk here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class HeroNotFoundState extends AbstractMonsterState
{
    public HeroNotFoundState(Monster monster)
    {
        super(monster);
        rng = new Random();
    }
    
    @Override
    public void move()
    {
        if (monster.isHeroNear())
        {
            monster.setState(MonsterStates.HERO_FOUND);
        }
        else
        {
            monster.setDirection(rng.nextInt() % NUM_DIRECTIONS);
            monster.move();
        }
    }
    private Random rng;
    private static final int NUM_DIRECTIONS = 4;
}