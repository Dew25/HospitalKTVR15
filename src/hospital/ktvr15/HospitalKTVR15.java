/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.ktvr15;
import hospital.classes.Division;
import hospital.classes.Doctor;
import hospital.classes.Nurse;
import hospital.classes.Pacient;
import hospital.classes.Position;
import hospital.classes.Staff;
import hospital.classes.Ward;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public class HospitalKTVR15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nurse nurse1 = new Nurse(80000,"Anna","Poljakova","47806064343");
        Nurse nurse2 = new Nurse(80000,"Zoja","Zaiceva","48807064343");
        List<Nurse> nurses = new ArrayList();
        nurses.add(nurse1);
        nurses.add(nurse2);
        
        Doctor doctor1 = new Doctor(100000,"Иван","Иванов","38714133242");
        Doctor doctor2 = new Doctor(100000,"Петр","Петров","38507043242");
        Doctor doctor3 = new Doctor(100000,"Сидор","Сидоров","38110133242");
        List<Doctor> doctors=new ArrayList();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        
        Ward ward1 = new Ward("114");
        Ward ward2 = new Ward("113");
        List<Ward> wards = new ArrayList<>();
        wards.add(ward1);
        wards.add(ward2);
        
        Position position = new Position("Санитар");
        
        Staff staff1 = new Staff(80000,position,"Николай","Николаев","38711133242");
        Staff staff2 = new Staff(80000,position,"Александра","Николаева","48704193242");
        Staff staff3 = new Staff(80000,position,"Светлана","Сидорова","48761153242");
        List<Staff> staffes = new ArrayList<>();
        staffes.add(staff1);
        staffes.add(staff2);
        staffes.add(staff3);
        
        Division division = new Division("Хирургия", wards,doctors,nurses,staffes);
        
        System.out.println(division.toString());
        System.out.println("---------------------------------");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,1,1,8,15,0);
        Date date1 = calendar.getTime();
        calendar.set(2016,1,10,17,20,34);
        Date date2 = calendar.getTime();
        Pacient pacient = new Pacient("болезнь1",date1,date2,division,doctor1,ward1,"Ants","Viira","35805234543");
        System.out.println(pacient.toString());
        
    }
    
}
