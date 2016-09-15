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
        
        Division division = new Division("Хирургия");
        Nurse nurse1 = new Nurse(80000,division,"Anna","Poljakova","47806064343");
        Nurse nurse2 = new Nurse(80000,division,"Zoja","Zaiceva","48807064343");
        List<Nurse> nurses = new ArrayList();
        nurses.add(nurse1);
        nurses.add(nurse2);
       
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,1,1,8,15,0);
        Date date1 = calendar.getTime();
        calendar.set(2016,1,10,17,20,34);
        Date date2 = calendar.getTime();
        Doctor doctor = new Doctor(100000,new Division("Хирургия"),nurses,"Иван","Иванов","38912143242");
        List<Pacient> pacients = new ArrayList();
        pacients.add(new Pacient(
                            "болезнь1", 
                            doctor,
                            date1,
                            date2,
                            new  Division("Хирургия"),
                            "Ivan","Ivanov","39706054343"
        ));
        pacients.add(new Pacient(
                            "болезнь2",
                            doctor,
                            date1,
                            date2,
                            new  Division("Хирургия"),
                            "Peter","Petrov","39209154343"
        ));
        List<Pacient> pacients2 = new ArrayList();
        pacients2.add(new Pacient(
                            "болезнь3", 
                            doctor,
                            date1,
                            date2,
                            new  Division("Хирургия"),
                            "Николай","Николаев","39302074343"
        ));
        pacients2.add(new Pacient(
                            "болезнь4",
                            doctor,
                            date1,
                            date2,
                            new  Division("Хирургия"),
                            "Федор","Федоров","39209154343"
        ));
       
        
        System.out.println("--------------");
        Ward ward = new Ward("112A",pacients);
        System.out.println(ward.toString());
        
        System.out.println("-------------");
        System.out.println(doctor.toString());
        
        System.out.println("-------------");
        List<Ward> wards = new ArrayList<>();
        wards.add(ward);
        wards.add(new Ward("113A",pacients2));
        Staff staff = new Staff(60000,new Position("Уборщик"),division, wards, "Игорь", "Серов","39004024325");
        System.out.println(staff.toString());
    }
    
}
