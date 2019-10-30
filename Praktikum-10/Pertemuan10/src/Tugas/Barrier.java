package Tugas;
public class Barrier implements Destroyable{
    private int strength;
    public Barrier(int strength) {
        this.strength = strength;
    }
    @Override
    public void destroyed() {
        this.strength -= strength * 0.1;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public String getBarrierInfo(){
        return "\nBarrier Strength = " + this.strength + "\n";
    }
}