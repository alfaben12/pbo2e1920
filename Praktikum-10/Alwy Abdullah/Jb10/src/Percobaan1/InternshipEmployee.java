package Percobaan1;

public class InternshipEmployee extends Employee{
    private int length;

    
    public InternshipEmployee(String name,int length) {
        super.name = name;
        this.length = length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public int getLength(){
        return length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += "Registered as Internship employee for " + length + " month/s\n";
        return info;
    }
    
    
    
    
}
