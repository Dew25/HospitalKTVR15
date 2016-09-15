package hospital.classes;


import interfaces.Peaple;
import util.ParseCode;

public class Person implements Peaple {

    private String name;
    private String surname;
    private String code;
    private Integer age;
    private String birthdey;
    private String gender;
    private ParseCode parseCode;
    
    
    public Person() {
    }

    public Person(String name, String surname, String code) {
        this.setName(name);
        this.setSurname(surname);
        this.setCode(code);
        this.parseCode = new ParseCode(this.code);
        this.setAge(this.parseCode);
        this.setBirthdey(this.parseCode);
        this.setGender(this.parseCode);
    }

    
    
    
    public Integer getAge() {
        return this.age;
    }
 
    public String getBirthday() {
        return this.birthdey;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAge(ParseCode parseCode) {
        //ParseCode parseCode=new ParseCode(code);
        this.age = parseCode.getAge();
    }

    public void setBirthdey(ParseCode parseCode) {
        //ParseCode parseCode=new ParseCode(code);
        this.birthdey = parseCode.getBirthdey();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(ParseCode parseCode) {
        //ParseCode parseCode=new ParseCode(code);
        this.gender = parseCode.getGender();
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", code=" + code + ", age=" + age + ", birthdey=" + birthdey + ", gender=" + gender +'}';
    }
    
}
