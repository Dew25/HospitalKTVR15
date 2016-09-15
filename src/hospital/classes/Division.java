package hospital.classes;

public class Division {

    private String divisionName;
    //private List<Ward> wards;

    public Division() {
    }

    public Division(String divisionName) {
        this.setDivisionName(divisionName);
        //this.wards = wards;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

//    public List<Ward> getWards() {
//        return wards;
//    }
//
//    public void setWards(List<Ward> wards) {
//        this.wards = wards;
//    }

    @Override
    public String toString() {
        return "отделение: " + divisionName;
    }
    
}
