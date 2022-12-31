package Case_Study.FuramaResort.model.model;


public abstract class Person {
   private String name;
   private String date;
   private String gender;
   private String cMND;
   private String phone;
   private String email;

    public Person() {
    }

    public Person( String name, String date, String gender, String cMND, String phone, String email) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.cMND = cMND;
        this.phone = phone;
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", cMND='" + cMND + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String convertLine(){
       final String COMMA = ",";
        return this.name+COMMA+this.date+COMMA+this.gender+COMMA+this.cMND+COMMA+this.phone+COMMA+this.email;
    }
}
