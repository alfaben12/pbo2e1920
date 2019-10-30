package tugas;

public abstract class Zombie implements IDestroyAble {
    protected int health;
    protected int level;

    public abstract void heal();

    public String getZombieInfo() {
        return "Health: " + this.health + "\n" +
                "Level: " + this.level;
    }
}
