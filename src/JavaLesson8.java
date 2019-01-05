public class JavaLesson8 {
    public static void main(String[] args) {
        MonsterTwo.buildBattleBoard();
        char[][] tempBattleBOard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName[r]
        MonsterTwo[] Monsters = new MonsterTwo[4];
        // MonsterTwo(int health, int attack, int movement, String name)

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
    }

}
