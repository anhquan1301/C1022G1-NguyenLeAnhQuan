package Case_Study.FuramaResort.model.model.extend_person;

import Case_Study.FuramaResort.model.model.Person;

public class Customer extends Person {
    String idCustomer;
    String customerType;
    String address;

    public Customer() {
    }

    public Customer(String idCustomer, String customerType, String address) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer( String idCustomer,String name, String date, String gender, String cMND, String phone,
                     String email, String customerType, String address) {
        super(name, date, gender, cMND, phone, email);
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
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
                "idCustomer=" + idCustomer +
                super.toString() +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }
    public String formatCSVCustomer(){
       final String COMMA = ",";
        return this.idCustomer+COMMA+super.convertLine()+COMMA +this.customerType+COMMA+this.address;
    }
}
