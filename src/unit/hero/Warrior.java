package unit.hero;

public class Warrior extends Hero{

    private static int warriorsNumber;

    {
        warriorsNumber++;
        setName("Warrior " + warriorsNumber);
        setAttack(5 + (int) (Math.random() * 2));
        setHealth(50 + (int) (Math.random() * 20));
        setRange(1);
        setSpeed(4 + (int) (Math.random() * 2));
    }

    public Warrior(int x, int y) {
        super(x, y);
    }

    @Override
    public void takeDamage(int damage) {
        if (Math.random() < 0.2) {
            System.out.println(getName() + " uses shield to prevent damage");
        } else {
            setHealth(getHealth() - damage);
            System.out.println(getName() + " takes " + damage + " damage");
        }
    }

}
