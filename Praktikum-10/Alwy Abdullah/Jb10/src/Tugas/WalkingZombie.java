package Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health = health * 2 / 10;
                break;
            case 2:
                health = health * 3 / 10;
                break;
            case 3:
                health = health * 4 / 10;
                break;
            default:
                System.out.println("Level tidak sesuai");
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02;
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data = ";
        info += "\nHealth = " + health;
        info += "\nLevel = " + level+ "\n";
        return info;
    }

}
