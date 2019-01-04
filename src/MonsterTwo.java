import java.lang.management.MonitorInfo;
import java.util.Arrays;

public class MonsterTwo {
    static char[][] battleBoard = new char[10][10];
    public static void buildBattleBoard() {
        for(char[] row : battleBoard) {
            Arrays.fill(row, '*');
        }
    }

    public static void redrawBoard() {
        int k = 1;
        while (k <= 30) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        for (int i = 0; i < battleBoard.length; i++) {
            for (int j = 0; j < battleBoard[i].length; j++) {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println();
        }
        k = 1;
        while (k <= 30) {
            System.out.print('-');
            k++;
        }
        System.out.println();
    }
    public final String TOMBSTONE = "Here lies a dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;

    private boolean alive = true;

    public String name = "Big monster";
    public int xPos = 0;
    public int yPos = 0;

    public int getAttack() {
        return attack;
    }
    public int getMovement() {
        return movement;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    // constructor method
    public MonsterTwo(int health, int attack, int movement) {
        this.health = health ;
        this.attack = attack;
        this.movement = movement;

    }

    // Default constructor
    public MonsterTwo() {

    }

    public MonsterTwo(int newHealth) {
        health = newHealth;
    }

    public MonsterTwo(int newHealth, int newAttack) {
        this(newHealth);
        attack = newAttack;
    }

    public static void main(String[] args) {
        MonsterTwo Frank = new MonsterTwo();

        System.out.println(Frank.attack);
    }



    public void setHealth(double decrease) {
        int intDecreaseHealth = (int) decrease;
        health = health - intDecreaseHealth;

        if (health < 0) {
            alive = false;
        }
    }
}
