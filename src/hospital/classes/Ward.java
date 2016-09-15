package hospital.classes;

import java.util.Iterator;
import java.util.List;

public class Ward {

    private String wardName;
    private List<Pacient> pacients;
    private Division division;
    

    public Ward() {
    }

    public Ward(String wardName, List<Pacient> pacients) {
        this.setWardName(wardName);
        this.setPacients(pacients);
        this.setDivision(division);
        
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

    private void setDivision(Division division) {
        this.division=division;
    }
    @Override
    public String toString() {
        Iterator iter = pacients.iterator();
        StringBuffer str = new StringBuffer();
        int i=0;
        while(iter.hasNext()){
            str.append(iter.next());
            i++;
        }
        return "   Информация о палате: " + wardName + ",\n   Пациенты в палате:\n   всего: "+i+"\n   " + str.toString();
    }

    
    
}
