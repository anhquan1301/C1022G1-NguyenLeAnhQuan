package Case_Study.FuramaResort.model.service.itf;

import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.repository.classIplm.EmployeesRepositoryIplm;
import Case_Study.FuramaResort.model.repository.itf.IEmployeesRepository;
import Case_Study.FuramaResort.model.service.IFuramaService;

public interface IEmployeesService extends IFuramaService {
    void deleteEmployees(String name);
    Employee findById(String id);
    void updateInformation(Employee employee);
}
