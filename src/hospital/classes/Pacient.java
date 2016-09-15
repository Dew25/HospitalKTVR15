package hospital.classes;

import java.util.Date;

public class Pacient extends Person {

    private String diagnos;
    private Date arrive;
    private Date departure;
    private Doctor doctor;
    private Division division;
 

    public Pacient() {
    }


    public Pacient(String diagnos,Doctor doctor, Date arrive, Date departure, Division division, String name, String surname, String code) {
        super(name, surname, code);
        this.setDiagnos(diagnos);
        this.setArrive(arrive);
        this.setDeparture(departure);
        this.setDoctor(doctor);
        this.setDivision(division);
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


    @Override
    public String toString() {
        return "\nПациент: \n "+super.getName()+" "+super.getSurname()+", воздаст "+super.getAge()+",\n Диагнос: " + diagnos + ",\n Больной поступил:" + arrive.toString() + ",\n Больной выписался:" + departure.toString() + ",\n   Лечащий доктор:" + doctor.getName()+" "+doctor.getSurname() + ",\n Отделение:\n   " + division.getDivisionName()+"\n";
    }
    
}
