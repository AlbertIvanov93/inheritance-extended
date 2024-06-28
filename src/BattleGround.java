import unit.Unit;
import unit.enemy.Enemy;
import unit.enemy.Zombie;
import unit.hero.Hero;
import unit.hero.Warrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleGround {

    private static int fieldHeight = 8;
    private static int fieldWidth = 8;
    private static Unit[][] battleField = new Unit[fieldHeight][fieldWidth];
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
        //delete all Units from battleField
        for (Unit[] row : battleField) {
            Arrays.fill(row, null);
        }

        //add heroes
        for (Hero hero : heroes) {
            battleField[hero.getX()][hero.getY()] = hero;
        }

        //add enemies
        for (Enemy enemy : enemies) {
            battleField[enemy.getX()][enemy.getY()] = enemy;
        }
    }

    private static void printField() {
        //System.out.println("+-+ +-+ +-+ +-+");
    }
}
