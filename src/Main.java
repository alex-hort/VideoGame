public class Main {
    public static void main(String[] args) {
        try {
            Player player = new Player("Hero", 10, "Warrior");
            Enemy enemy = new Enemy("Evil One", 8, "Dragon");

            Player invalidPlayer = new Player("Invalid Hero", -2, "Mage");

            player.attack();
            player.useSpecialAbility();
            System.out.println();
            enemy.attack();
            enemy.yell();
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}

