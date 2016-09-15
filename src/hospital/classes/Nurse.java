package hospital.classes;

import interfaces.Employee;

public class Nurse extends Person implements Employee {

    private Integer salary;
    private Division division;
    private Doctor doctor;

    public Nurse() {
    }

    public Nurse(Integer salary, Doctor doctor) {
        this.salary = salary;
        this.doctor = doctor;
    }

    public Nurse(Integer salary, Doctor doctor, String name, String surname, String code) {
        super(name, surname, code);
        this.salary = salary;
        this.doctor = doctor;
    }

    @Override
    public Integer getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Nurse{" + "salary=" + salary + ", division=" + division + ", doctor=" + doctor + '}';
    }
    
}
