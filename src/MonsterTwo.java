import java.lang.management.MonitorInfo;

public class MonsterTwo {
    public final String TOMBSTONE = "Here lies a dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPos = 0;
    private int yPos = 0;
    private boolean alive = true;

    public String name = "Big monster";

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
