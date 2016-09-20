package hospital.classes;


public class Ward {

    private String wardName;
   // private List<Pacient> pacients;
//    private Division division;
    

    public Ward() {
    }

//    public Ward(String wardName, List<Pacient> pacients) {
//        this.setWardName(wardName);
//        this.setPacients(pacients);
//        this.setDivision(division);
//        
//    }

    public Ward(String wardName) {
        this.wardName = wardName;
//        this.division = division;
    }
    

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

//    public List<Pacient> getPacients() {
//        return pacients;
//    }
//
//    public void setPacients(List<Pacient> pacients) {
//        this.pacients = pacients;
//    }

//    public void setDivision(Division division) {
//        this.division=division;
//    }
//
//    public Division getDivision() {
//        return division;
//    }

    @Override
    public String toString() {
       
        return "    Палата: " + getWardName();
    }


    
    
}
