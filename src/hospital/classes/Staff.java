package hospital.classes;

import interfaces.Employee;
import java.util.List;

public class Staff extends Person implements Employee {

    private Integer salary;
    private Position position;
    private Division division;
    private List<Ward> wards;

    public Staff() {
    }

    public Staff(Integer salary, Position position, Division division, List<Ward> wards, String name, String surname, String code) {
        super(name, surname, code);
        this.salary = salary;
        this.position = position;
        this.division = division;
        this.wards = wards;
    }

    @Override
    public Integer getSalary() {
        return this.salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Ward> getWards() {
        return wards;
    }

    public void setWards(List<Ward> wards) {
        this.wards = wards;
    }

    @Override
    public String toString() {
        return "Staff{" + "salary=" + salary + ", position=" + position + ", division=" + division + ", wards=" + wards + '}';
    }
    
}
