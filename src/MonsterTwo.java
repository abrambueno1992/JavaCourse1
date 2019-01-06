import java.lang.management.MonitorInfo;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

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
    public char nameChar1 = 'B';
    public int xPos = 0;
    public int yPos = 0;
    public static int numOfMonsters = 0;

    public int getAttack() {
        return attack;
    }
    public int getMovement() {
        return movement;
    }
    public int getHealth() {
        return health;
    }
    public boolean getAlive() {
        return alive;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    // constructor method
    public MonsterTwo(int health, int attack, int movement, String name) {
        this.health = health ;
        this.attack = attack;
        this.movement = movement;
        this.name = name;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY  = (int) (Math.random() * maxYBoardSpace);
        } while (battleBoard[randNumX][randNumY] != '*');

        this.xPos = randNumX;
        this.yPos = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPos][this.xPos] = this.nameChar1;
        numOfMonsters++;
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
    public void moveMonster(MonsterTwo[] monster, int arrayItemIndex) {
        boolean isSpaceOpen = true;
        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        while (isSpaceOpen) {
            int randMoveDirection = (int) (Math.random() * 4);
            int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));

            System.out.println(randMoveDistance + " " + randMoveDirection);
            battleBoard[this.yPos][this.xPos] = '*';

            if (randMoveDirection == 0) {
                if ((this.yPos - randMoveDistance) < 0) {
                    this.yPos = 0;
                } else {
                    this.yPos = this.yPos - randMoveDistance;
                }
            } else if (randMoveDirection == 1) {
                if ((this.yPos + randMoveDistance) > maxXBoardSpace) {
                    this.xPos = maxXBoardSpace;
                } else {
                    this.xPos = this.xPos + randMoveDistance;
                }
            } else if (randMoveDirection == 2) {
                if ((this.yPos + randMoveDistance) > maxYBoardSpace) {
                    this.yPos = maxYBoardSpace;
                } else {
                    this.yPos = this.yPos + randMoveDistance;
                }
            } else  {
                if ((this.xPos - randMoveDistance) < 0) {
                    this.xPos = 0;
                } else {
                    this.xPos = this.xPos - randMoveDistance;
                }
            }
            for (int i = 0; i < monster.length; i++) {
                // Monster Frank x = 1 y = 3
                if (i == arrayItemIndex) {
                    continue;
                }
                if (onMySpace(monster, i, arrayItemIndex)) {
                    // <<<<<<>>>>>>>><<<<<<>>>>>
                    isSpaceOpen = true;
                    break;
                } else {
                    isSpaceOpen = false;
                }
            }
        } // end of while loop
        battleBoard[this.yPos][this.xPos] = this.nameChar1;

    } // End of moveMonster
    public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2) {
        if ((monster[indexToChk1].xPos) == (monster[indexToChk2].xPos) && (monster[indexToChk1].yPos) == (monster[indexToChk2].yPos)){
            return true;
        } else {
            return false;
        }
    }
}
