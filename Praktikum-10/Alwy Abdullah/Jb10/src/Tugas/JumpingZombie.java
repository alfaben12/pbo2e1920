package Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health = health * 3 / 10;
                break;
            case 2:
                health = health * 4 / 10;
                break;
            case 3:
                health = health * 5 / 10;
                break;
            default:
                System.out.println("Level tidak sesuai");
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.01;
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data = ";
        info += "\nHealth = " + health;
        info += "\nLevel = " + level+ "\n";
        return info;
    }

}
