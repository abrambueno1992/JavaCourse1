import java.lang.management.MonitorInfo;

public class JavaLesson7 {
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
    public Monster(int newHealth, int newAttack, int newMovement) {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
    }

    // Default constructor
    public Monster() {

    }



    public void setHealth(double decrease) {
        int intDecreaseHealth = (int) decrease;
        health = health - intDecreaseHealth;

        if (health < 0) {
            alive = false;
        }
    }
}
