/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author Vivi Agustina
 */
public class InternshipEmployee extends Employee{
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
 
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
