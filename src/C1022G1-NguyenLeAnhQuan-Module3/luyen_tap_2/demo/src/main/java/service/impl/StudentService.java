package service.impl;

import model.Class;
import model.Student;
import repository.IStudentRepository;
import repository.impl.StudentRepository;
import service.IStudenService;

import java.util.List;

public class StudentService implements IStudenService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> search(String name) {
        if(name==null){
            name="";
        }
        return iStudentRepository.search(name);
    }

    @Override
    public void create(String name, double score, int class_id) {
        iStudentRepository.create(name,score,class_id);
    }

    @Override
    public Student findById(int id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public void edit(Student student) {
        iStudentRepository.edit(student);
    }

    @Override
    public void delete(int id) {
        iStudentRepository.delete(id);
    }

    @Override
    public List<Class> search() {
        return iStudentRepository.search();
    }
}
