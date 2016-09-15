package hospital.classes;

import java.util.List;

public class Ward {

    private String wardName;
    private List<Pacient> pacients;
    

    public Ward() {
    }

    public Ward(String wardName, List<Pacient> pacients) {
        this.wardName = wardName;
        this.pacients = pacients;
        
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public List<Pacient> getPacients() {
        return pacients;
    }

    public void setPacients(List<Pacient> pacients) {
        this.pacients = pacients;
    }

   
    @Override
    public String toString() {
        return "Ward{" + "wardName=" + wardName + ", pacients=" + pacients + '}';
    }
    
}
