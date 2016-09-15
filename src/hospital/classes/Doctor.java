package hospital.classes;

import interfaces.Employee;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person implements Employee {

    private Integer salary;
    private List<Pacient> pacients = new ArrayList<>();
    private Division division;
    private List<Nurse> nurses=new ArrayList<>();

    public Doctor() {
    }

    public Doctor(Integer salary, List<Pacient> pacients, Division division, List<Nurse> nurses, String name, String surname, String code) {
        super(name, surname, code);
        this.setSalary(salary);
        this.setPacients(pacients);
        this.setDivision(division);
        this.setNurses(nurses);
    }

    @Override
    public Integer getSalary() {
        return this.salary;
    }

    public List<Pacient> getPacients() {
        return pacients;
    }

    public void setPacients(List<Pacient> pacients) {
        this.pacients = pacients;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" + "salary=" + salary + ", pacients=" + pacients + ", division=" + division + ", nurses=" + nurses + '}';
    }
    
}
