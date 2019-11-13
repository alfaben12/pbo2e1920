package tugas;

public class Barrier implements IDestroyAble {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength: " + this.strength;
    }

    @Override
    public void destroyed() {
        this.strength -= (this.strength * 0.1);
    }
}
