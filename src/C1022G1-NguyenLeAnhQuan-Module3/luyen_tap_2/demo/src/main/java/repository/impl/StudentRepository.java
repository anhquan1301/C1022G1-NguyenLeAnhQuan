package repository.impl;

import model.Class;
import model.Student;
import repository.BaseRepository;
import repository.IStudentRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public List<Student> search(String name) {
        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select s.id, s.name, s.score, c.name from student s join class c on s.class_id = c.id where s.name like concat('%',?,'%')");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student;
            while (resultSet.next()){
                int id = resultSet.getInt("s.id");
                String nameStudent = resultSet.getString("s.name");
                double score = resultSet.getDouble("s.score");
                String cName = resultSet.getString("c.name");
                Class nameClass = new Class(cName);
                student = new Student(id,nameStudent,score,nameClass);
                studentList.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    @Override
    public void create(String name,double score, int class_id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("insert into student (name,score,class_id) values (?,?,?);");
            preparedStatement.setString(1,name);
            preparedStatement.setDouble(2,score);
            preparedStatement.setInt(3,class_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findById(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select s.id, s.name, s.score, c.name from student s join class c on s.class_id = c.id where s.id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student;
            while (resultSet.next()){
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setScore(resultSet.getDouble("score"));
                String cName = resultSet.getString("c.name");
                Class nameClass = new Class(cName);
                student.setClassName(nameClass);
                return student;

            };
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void edit(Student student) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("update student set name=?, score=?, class_id=? where id=?");
            preparedStatement.setString(1,student.getName());
            preparedStatement.setDouble(2,student.getScore());
            preparedStatement.setInt(3,student.getClassName().getId());
            preparedStatement.setInt(4,student.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("delete from student where id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Class> search() {
        List<Class> classList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select * from class");
            ResultSet resultSet = preparedStatement.executeQuery();
            Class c;
            while (resultSet.next()){
                c = new Class();
                c.setId(resultSet.getInt("id"));
                c.setName(resultSet.getString("name"));
                classList.add(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return classList;
    }
}
