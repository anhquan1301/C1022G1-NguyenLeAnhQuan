package repository;

import model.Class;
import model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> search(String name);
    void create (String name,double score, int class_id);
    Student findById(int id);
    void edit(Student student);
    void delete(int id);
    List<Class> search();
}
