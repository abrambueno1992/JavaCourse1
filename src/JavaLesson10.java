import org.apache.commons.lang3.ArrayUtils;

public class JavaLesson10 {
    public static void main(String[] args) {
        MonsterTwo.buildBattleBoard();
        char[][] tempBattleBOard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName[r]
        MonsterTwo[] Monsters = new MonsterTwo[4];
        // MonsterTwo(int health, int attack, int movement, String name)

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[1] = new MonsterTwo(800, 30, 2, "Frank");
        Monsters[2] = new MonsterTwo(600, 50, 1, "Frank");
        Monsters[3] = new MonsterTwo(1200, 20, 1, "Frank");

        MonsterTwo.redrawBoard();
    }
    for (MonsterTwo m : Monsters) {
        if (m.getAlive()) {
            int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
            m.moveMonster(Monsters, arrayItemIndex);

        }
    }
    MonsterTwo.redrawBoard();
}
