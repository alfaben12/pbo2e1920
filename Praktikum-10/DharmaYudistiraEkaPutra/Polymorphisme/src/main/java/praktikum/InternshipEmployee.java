package praktikum;

public class InternshipEmployee extends Employee {
    private int length;

    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += "Registered as internship employee for " + this.length + " month/s\n";
        return info;
    }
}
