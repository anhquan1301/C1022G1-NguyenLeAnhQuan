package Case_Study.FuramaResort.model.model.extend_person;

import Case_Study.FuramaResort.model.model.Person;

public class Employee extends Person {
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String level, String position, String salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String date, String gender, String cMND, String phone, String email, String level, String position, String salary) {
        super(id, name, date, gender, cMND, phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id " + getId() +
                ", name: " + getName()+
                ", birthday: " + getDate()+
                ", gender: " + getGender()+
                ", CMND: " + getcMND()+
                ", phone: " + getPhone()+
                ", email: "+ getEmail()+
                ", level: " + level +
                ", position: " + position +
                ", salary: " + salary +
                '}';
    }

}
