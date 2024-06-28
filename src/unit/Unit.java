package unit;

import unit.enemy.Enemy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    private void findNearestOpponent(Unit[][] battleField) {
        boolean isNearestOpponentFound = false;
        List<Cell> cellsToCheck = new ArrayList<>();
        List<Cell> checkedCells = new ArrayList<>();
        List<Unit> opponentsFound = new ArrayList<>();

        cellsToCheck.add(new Cell(this.x, this.y));

        while (!isNearestOpponentFound) {
            for (Cell cell : cellsToCheck) {
                if (isMovePossible(cell.getX() + 1, cell.getY(), battleField)
                        && battleField[cell.getX() + 1][cell.getY()] != null
                        && battleField[cell.getX() + 1][cell.getY()] instanceof Enemy enemy) {
                    opponentsFound.add(enemy);
                }

            }
        }


        if (battleField[this.getX() + 1][this.getY()] instanceof Enemy enemy) {
            opponents.add(enemy);
        }
        if (battleField[this.getX() - 1][this.getY()] instanceof Enemy enemy) {
            opponents.add(enemy);
        }
        if (battleField[this.getX()][this.getY() + 1] instanceof Enemy enemy) {
            opponents.add(enemy);
        }
        if (battleField[this.getX()][this.getY() - 1] instanceof Enemy enemy) {
            opponents.add(enemy);
        }

        if (opponents.isEmpty()) {

        } else if (opponents.size() == 1) {

        } else {

        }
    }

    private boolean isMovePossible(int x, int y, Unit[][] battleField) {
        //if cell is out of border
        if (x < 0 || x > battleField[0].length || y < 0 || y > battleField.length) {
            return false;
            //if cell is empty
        } else if (battleField[y][x] != null) {
            return true;
        }

        return false;
    }

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

    private class Cell {
        private int x;
        private int y;

        public Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
