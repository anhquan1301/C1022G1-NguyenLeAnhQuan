package Case_Study.FuramaResort.model.repository.itf;

import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.repository.IFuramaRepository;

public interface IEmployeesRepository extends IFuramaRepository {
    Employee findById(String id);
    void deleteEmployees(String id);
    void updateInformation(Employee employee);
}
