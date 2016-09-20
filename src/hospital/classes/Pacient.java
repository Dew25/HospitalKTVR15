package hospital.classes;

import entity.Person;
import java.util.Date;

public class Pacient extends Person {

    private String diagnos;
    private Date arrive;
    private Date departure;
    private Doctor doctor;
    private Division division;
    private Ward ward;

    public Pacient() {
    }


    public Pacient(String diagnos, Date arrive, Date departure, Division division,Doctor doctor, Ward ward, String name, String surname, String code) {
        super(name, surname, code);
        this.setDiagnos(diagnos);
        this.setArrive(arrive);
        this.setDeparture(departure);
        this.setDoctor(doctor);
        this.setDivision(division);
        this.setWard(ward);
    }



    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    public Date getArrive() {
        return arrive;
    }

    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }


    @Override
    public String toString() {
        return "Пациент: "+super.getFirstname()+" "+super.getLastname()+
                ",\n  Воздаст "+super.getAge()+
                ",\n  Диагнос: " + getDiagnos() + 
                ",\n  Больной поступил: " + getArrive().toString() +
                ",\n  Больной выписался: " + getDeparture().toString() + 
                ",\nОтделение: " + getDivision().getDivisionName()+
                ",\nДоктор:"+getDoctor().getFirstname()+" "+getDoctor().getLastname();
    }
    
}
