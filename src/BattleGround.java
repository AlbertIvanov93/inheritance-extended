import unit.Unit;
import unit.enemy.Enemy;
import unit.enemy.Zombie;
import unit.hero.Hero;
import unit.hero.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleGround {

    private static Unit[][] battleField = new Unit[8][8];
    private static List<Hero> heroes = new ArrayList<>();
    private static List<Enemy> enemies = new ArrayList<>();

    public static void main(String[] args) {
        Hero hero = new Warrior(0, 0);
        Enemy enemy = new Zombie(7, 7);
        heroes.add(hero);
        enemies.add(enemy);


    }

    private static void startRound() {
        refreshBattleField();
        for (Unit unit : heroes) {
            unit.move(battleField);
            unit.attack(battleField);
        }
    }

    private static void refreshBattleField() {
        for (Unit[] row : battleField) {
            for (Unit[] cell : battleField) {
                cell = null;
            }
        }

        for (Hero hero : heroes) {
            battleField[hero.getX()][hero.getY()] = hero;
        }

        for (Enemy enemy : enemies) {
            battleField[enemy.getX()][enemy.getY()] = enemy;
        }
    }
}
