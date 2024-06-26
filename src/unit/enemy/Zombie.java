package unit.enemy;

public class Zombie extends Enemy{

    private static int zombiesNumber;

    {
        zombiesNumber++;
        setName("Zombie " + zombiesNumber);
        setAttack(3 + (int) (Math.random() * 3));
        setHealth(40 + (int) (Math.random() * 20));
        setRange(1);
        setSpeed(3 + (int) (Math.random() * 1));
    }

    public Zombie(int x, int y) {
        super(x, y);
    }

    @Override
    public void takeDamage(int damage) {

    }
}
