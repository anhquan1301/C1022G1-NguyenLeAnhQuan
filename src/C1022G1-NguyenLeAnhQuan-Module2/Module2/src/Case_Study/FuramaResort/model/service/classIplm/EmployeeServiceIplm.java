package Case_Study.FuramaResort.model.service.classIplm;

import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.repository.classIplm.EmployeesRepositoryIplm;
import Case_Study.FuramaResort.model.repository.itf.IEmployeesRepository;
import Case_Study.FuramaResort.model.service.itf.IEmployeesService;

public class EmployeeServiceIplm implements IEmployeesService {
    private static IEmployeesRepository iER = new EmployeesRepositoryIplm();
    @Override
    public void displayList() {
        iER.displayList();
    }

    @Override
    public void addList(Object object) {
        iER.addList(object);
    }

    @Override
    public void deleteEmployees(String name) {
        iER.deleteEmployees(name);
    }

    @Override
    public Employee findById(String id) {
        return iER.findById(id);
    }

    @Override
    public void updateInformation(Employee employee) {
        iER.updateInformation(employee);
    }
}
