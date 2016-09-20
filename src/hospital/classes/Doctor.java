package hospital.classes;

import entity.Person;
import interfaces.Employee;


public class Doctor extends Person implements Employee {

    private Integer salary;
    //private List<Pacient> pacients = new ArrayList<>();
//    private Division division;
//    private List<Nurse> nurses=new ArrayList<>();

    public Doctor() {
    }

//    public Doctor(Integer salary, Division division, List<Nurse> nurses, String name, String surname, String code) {
//        super(name, surname, code);
//        this.setSalary(salary);
//        //this.setPacients(pacients);
//        this.setDivision(division);
//        this.setNurses(nurses);
//    }

    @Override
    public Integer getSalary() {
        return this.salary;
    }

//    public List<Pacient> getPacients() {
//        return pacients;
//    }
//
//    public void setPacients(List<Pacient> pacients) {
//        this.pacients = pacients;
//    }

//    public Division getDivision() {
//        return division;
//    }
//
//    public void setDivision(Division division) {
//        this.division = division;
//    }
//
//    public List<Nurse> getNurses() {
//        return nurses;
//    }
//
//    public void setNurses(List<Nurse> nurses) {
//        this.nurses = nurses;
//    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        Iterator iter = this.nurses.iterator();
//        StringBuilder nurs = new StringBuilder();
//        while(iter.hasNext()){
//            nurs.append(iter.next());
//        }
//        return "Доктор: "+getFirstname()+" "+getLastname()+" \n  зарплата доктора:" + (double)salary/100 + ",\n  работает в отделении:" + division.getDivisionName() + ".\n  Медсестры доктора: "+nurs.toString();
//    }

    public Doctor(Integer salary, String firstname, String lastname, String code) {
        super(firstname, lastname, code);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "    Доктор: " +super.getFirstname()+" "+super.getLastname()+  "\n Зарплата: " + getSalary();
    }
    
    
}
