package Case_Study.FuramaResort.model.repository.itf;

import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.repository.IFuramaRepository;

public interface IEmployeesRepository extends IFuramaRepository {
    void deleteEmployees(String name);
    Employee findById(int id);
    void updateInformation(Employee employee);
}
