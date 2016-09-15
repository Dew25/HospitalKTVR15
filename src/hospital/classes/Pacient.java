package hospital.classes;

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


    public Pacient(String diagnos, Date arrive, Date departure, Doctor doctor, Division division, Ward ward, String name, String surname, String code) {
        super(name, surname, code);
        this.diagnos = diagnos;
        this.arrive = arrive;
        this.departure = departure;
        this.doctor = doctor;
        this.division = division;
        this.ward = ward;
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
        return "Pacient{" + "diagnos=" + diagnos + ", arrive=" + arrive + ", departure=" + departure + ", doctor=" + doctor + ", division=" + division + ", ward=" + ward + '}';
    }
    
}
