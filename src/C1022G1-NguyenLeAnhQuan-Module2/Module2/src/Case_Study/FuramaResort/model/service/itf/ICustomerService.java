package Case_Study.FuramaResort.model.service.itf;

import Case_Study.FuramaResort.model.model.extend_person.Customer;
import Case_Study.FuramaResort.model.service.IFuramaService;

public interface ICustomerService extends IFuramaService {
    Customer findById(int id);
    void updateInformation(Customer customer);
}
