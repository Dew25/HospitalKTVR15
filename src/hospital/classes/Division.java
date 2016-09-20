package hospital.classes;

import java.util.List;

public class Division {

    private String divisionName;
    private List<Ward> wards;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Staff> staffes;

    public Division() {
    }

    public Division(String divisionName, List<Ward> wards, List<Doctor> doctors, List<Nurse> nurses,List<Staff> staffes) {
        this.setDivisionName(divisionName);
        this.setWards(wards);
        this.setDoctors(doctors);
        this.setNurses(nurses);
        this.setStaffes(staffes);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Ward> getWards() {
        return wards;
    }

    public void setWards(List<Ward> wards) {
        this.wards = wards;
    }

    public List<Staff> getStaffes() {
        return staffes;
    }

    public void setStaffes(List<Staff> staffes) {
        this.staffes = staffes;
    }

    @Override
    public String toString() {
        StringBuilder strWards = new StringBuilder();
        for (Ward ward : wards) {
            strWards.append(ward.getWardName() + ";\n");
        }
        StringBuilder strDoctors = new StringBuilder();
        for (Doctor doctor : doctors) {
            strDoctors.append(doctor.getFirstname()+" "+doctor.getLastname() + ";\n");
        }
        StringBuilder strNurses = new StringBuilder();
        for (Nurse nurse : nurses) {
            strNurses.append(nurse.getFirstname()+" "+nurse.getLastname() + ";\n");
        }
        StringBuilder strStaffes = new StringBuilder();
        for ( Staff staff : staffes) {
            strStaffes.append(staff.getFirstname()+" "+staff.getLastname() + ";\n");
        }
        return "Oтделение: " + getDivisionName() + 
                "\n Палаты: \n" + strWards.toString()+
                "\n Доктора: \n"+strDoctors.toString()+
                "\n Сестры: \n"+strNurses.toString()+
                "\n Санитары: \n"+strStaffes.toString();
    }

}
