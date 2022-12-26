package Case_Study.FuramaResort.model.repository.itf;

import Case_Study.FuramaResort.model.model.extend_person.Customer;
import Case_Study.FuramaResort.model.repository.IFuramaRepository;

public interface ICustomerRepository extends IFuramaRepository {
    Customer findById(int id);
    void updateInformation(Customer customer);
}
