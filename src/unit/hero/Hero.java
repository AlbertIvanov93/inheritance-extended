package unit.hero;

import unit.Unit;
import unit.enemy.Enemy;

import java.util.List;

public abstract class Hero extends Unit {

    public Hero(int x, int y) {
        super(x, y);
    }

    public void useHealthPotion() {
        setHealth(getHealth() + 20);
    }

    @Override
    public void move(Unit[][] units) {

    }

    private Enemy findNearestEnemy(Unit[][] units) {
        for (Unit[] row : units) {
            for (Unit unit : row) {

            }
        }
    }
}
