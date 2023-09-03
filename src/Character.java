class Character {
    protected String name;
    protected int level;

    public Character(String name, int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level cannot be less than 1");
        }
        this.name = name;
        this.level = level;
    }

    public void attack() {
        if (level < 5) {
            throw new RuntimeException(name + " cannot attack. Level is too low.");
        }
        System.out.println(name + " attacks!");
    }
}

class Player extends Character {
    private String playerClass;

    public Player(String name, int level, String playerClass) {
        super(name, level);
        this.playerClass = playerClass;
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses special ability as a " + playerClass + "!");
    }
}

class Enemy extends Character {
    private String type;

    public Enemy(String name, int level, String type) {
        super(name, level);
        this.type = type;
    }

    public void yell() {
        System.out.println(name + " the " + type + " lets out a fearsome cry!");
    }
}