package Case_Study.FuramaResort.model.repository.classIplm;

import Case_Study.FuramaResort.model.model.extend_person.Customer;
import Case_Study.FuramaResort.model.repository.itf.ICustomerRepository;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryIplm implements ICustomerRepository {
    private static List<Customer> customerList = new LinkedList<>();
    static {
        customerList.add(new Customer("1", "Nguyễn Lê Anh Quân", "13/01/2000", "Nam","201888881","0909999999",
                "nlaq123@gmail.com", "Diamond", "678 Phạm Văn Đồng, Đà Nẵng"));
        customerList.add(new Customer("2", "Lê Thị B", "18/04/1998", "Nữ","201834581","0909342999",
                "mld33@gmail.com", "Gold", "123 Hoàng Diệu, Đà Nẵng"));
        customerList.add(new Customer("3", "Trần Văn Đ", "24/01/1988", "Nam","201812381","0909839999",
                "nek44@gmail.com", "Member", "222 Trưng Nữ Vương, Đà Nẵng"));
    }
    @Override
    public void displayList() {
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }

    @Override
    public void addList(Object object) {
        Customer customer = (Customer) object;
        customerList.add(customer);
    }

    @Override
    public Customer findById(String id) {
        for (int i=0; i<customerList.size();i++){
            if(customerList.get(i).getIdCustomer().equals(id)){
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateInformation(Customer customer) {
        for (int i = 0; i <customerList.size() ; i++) {
            if(customerList.get(i).getIdCustomer().equals(customer.getIdCustomer())){
                customerList.set(i,customer);
            }
        }
    }
}
