package repeat.session1;

public class Application {
    public static void main(String[] args) {
        Knight knight = new Knight();

        String quest1 = knight.questDone(new DeadIslandQuest());
        String quest2 = knight.questDone(new EliteKnightQuest());
        DeadIslandQuest quest3 = new DeadIslandQuest();
        System.out.println(quest3);

        System.out.println(quest1);
        System.out.println(quest2);

    }
}
