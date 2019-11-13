package tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (this.health * 0.03);
                break;
            case 2:
                this.health += (this.health * 0.04);
                break;
            case 3:
                this.health += (this.health * 0.05);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (this.health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data: \n " + super.getZombieInfo();
    }
}
