package Case_Study.FuramaResort.model.repository.classIplm;

import Case_Study.FuramaResort.model.model.extend_person.Employee;
import Case_Study.FuramaResort.model.repository.itf.IEmployeesRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeesRepositoryIplm implements IEmployeesRepository {
    private static List<Employee> employeesList = new ArrayList<>();
    static {
        employeesList.add(new Employee(1,"Nguyễn Lê Anh Quân", "13/01/2000","Nam","201838822","0909999999","nlaquan1301@gmail.com","Đại học","Giám Đốc","5000"));
        employeesList.add(new Employee(2,"Nguyễn Văn B", "15/11/1995","Nam","201885769","0909911252","abcd@gmail.com","Trung cấp","Lễ Tân","250"));
        employeesList.add(new Employee(3,"Nguyễn Văn C", "11/09/1999","Nam","201736495","0909234554","abcd123@gmail.com","Cao Đẳng","Quản Lí","600"));
    }
    @Override
    public void displayList() {
        for (Employee employee: employeesList){
            System.out.println(employee);
        }
    }

    @Override
    public void addList(Object obj) {
        Employee employee = (Employee) obj;
        employeesList.add(employee);
    }

    @Override
    public void deleteEmployees(String name) {
        for (Employee employee: employeesList){
            if (employee.getName().equals(name)){
                employeesList.remove(employee);
            }
        }
    }

    @Override
    public Employee findById(int id) {
        for (int i=0; i<employeesList.size();i++){
            if(employeesList.get(i).getId()==id){
                return employeesList.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateInformation(Employee employee) {
        for (int i=0;i<employeesList.size();i++){
            if(employeesList.get(i).getId()==employee.getId()){
                employeesList.set(i,employee);
            }
        }
    }
}
