package unit;

public abstract class Unit {
    private String name;
    private int health;
    private int x;
    private int y;
    private int attack;
    private int range;
    private int speed;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void attack(Unit[][] battleField) {
        //unit.takeDamage(attack);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void move(Unit[][] battleField);

    public abstract void takeDamage(int damage);

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAttack() {
        return attack;
    }

    public int getRange() {
        return range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
