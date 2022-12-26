package Case_Study.FuramaResort.model.service.classIplm;

import Case_Study.FuramaResort.model.model.extend_person.Customer;
import Case_Study.FuramaResort.model.repository.classIplm.CustomerRepositoryIplm;
import Case_Study.FuramaResort.model.repository.classIplm.EmployeesRepositoryIplm;
import Case_Study.FuramaResort.model.repository.itf.ICustomerRepository;
import Case_Study.FuramaResort.model.repository.itf.IEmployeesRepository;
import Case_Study.FuramaResort.model.service.itf.IBookingService;
import Case_Study.FuramaResort.model.service.itf.ICustomerService;
import Case_Study.FuramaResort.model.service.itf.IEmployeesService;

public class CustomerServiceIplm implements ICustomerService{
    private static ICustomerRepository iCR = new CustomerRepositoryIplm();
    @Override
    public void displayList() {
        iCR.displayList();
    }

    @Override
    public void addList(Object object) {
        iCR.addList(object);
    }

    @Override
    public Customer findById(int id) {
        return iCR.findById(id);
    }

    @Override
    public void updateInformation(Customer customer) {
        iCR.updateInformation(customer);
    }
}
