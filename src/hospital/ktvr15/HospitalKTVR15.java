/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.ktvr15;
import hospital.classes.Division;
import hospital.classes.Doctor;
import hospital.classes.Pacient;
import hospital.classes.Person;
import hospital.classes.Position;
import hospital.classes.Ward;
import java.util.ArrayList;
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
//        Person person = new Person("Peter","Petrov","38706103432");
//        List<Position> positions = new ArrayList<>();
//        positions.add(new Position("Санитар"));
//        positions.add(new Position("Уборщик"));
//        positions.add(new Position("Повар"));
        
        
        //Ward ward = new Ward("112A",new ArrayList<Pacinent>(),division );
        //System.out.println(person.toString());
        List<Pacient> pacients = new ArrayList();
        List<Nurse> nurses = new ArrayList();
        
        Pacient pacient = new Pacient(new Diagnos("болезнь1"), 
                            new Date(),
                            new Date(5605050), 
                            new Doctor(100000,pacients,new Division("Хирургия"),nurses,"Иван","Иванов","38912143242"),
                            
        );
        
    }
    
}
