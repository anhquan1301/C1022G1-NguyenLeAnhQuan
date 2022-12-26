package Case_Study.FuramaResort.model.model.extend_person;

import Case_Study.FuramaResort.model.model.Person;

public class Customer extends Person {
    String customerType;
    String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String date, String gender, String cMND, String phone
            , String email, String customerType, String address) {
        super(id, name, date, gender, cMND, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id " + getId() +
                ", name: " + getName()+
                ", birthday: " + getDate()+
                ", gender: " + getGender()+
                ", CMND: " + getcMND()+
                ", phone: " + getPhone()+
                ", email: "+ getEmail()+
                ", customerType: " + customerType +
                ", address: " + address +
                '}';
    }
}
