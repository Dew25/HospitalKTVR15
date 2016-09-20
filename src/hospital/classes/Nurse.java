package hospital.classes;

import entity.Person;
import interfaces.Employee;

public class Nurse extends Person implements Employee {

    private Integer salary;
    //private Division division;
    //private Doctor doctor;

    public Nurse() {
    }

    public Nurse(Integer salary, String name, String surname, String code) {
        super(name, surname, code);
        this.setSalary(salary);
        //this.setDivision(division);
        //this.doctor = doctor;
    }

    @Override
    public Integer getSalary() {
        return this.salary;
    }
    private void setSalary(Integer salary) {
        this.salary=salary;
    }
    
//    public Division getDivision() {
//        return division;
//    }
//
//    public void setDivision(Division division) {
//        this.division = division;
//    }
    
    @Override
    public String toString() {
        return "\n  медсестра: "+super.getFirstname()+" "+super.getLastname()+"\n  зарплата: " + getSalary() + " EUR,";
    }

    
}
