package Case_Study.FuramaResort.model.model.extend_person;

import Case_Study.FuramaResort.model.model.Person;

public class Employee extends Person {
    private int idEmplyee;
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(int idEmplyee, String level, String position, String salary) {
        this.idEmplyee = idEmplyee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee( int idEmplyee,String name, String date, String gender, String cMND, String phone, String email, String level, String position, String salary) {
        super(name, date, gender, cMND, phone, email);
        this.idEmplyee = idEmplyee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getIdEmplyee() {
        return idEmplyee;
    }

    public void setIdEmplyee(int idEmplyee) {
        this.idEmplyee = idEmplyee;
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
                "idEmplyee=" + idEmplyee +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} " + super.toString();
    }
}
