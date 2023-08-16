package baitap.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    @Override
    public int compareTo(Student o) {
        // Sắp xếp theo 1 tiêu chí là điểm
        return this.score - o.getScore();
    }
    @Override
    public String toString() {
        return name + " - " + score;
    }
}

 class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Sắp xếp theo 2 tiêu chí nếu điểm bằng nhau thì sắp xếp theo tên
        int scoreCompare = student1.getScore() - student2.getScore();
        if (scoreCompare != 0) {
            return scoreCompare;
        }
        return student1.getName().compareTo(student2.getName());
    }
}
class DemoComparableAndComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mary", 85));
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        Collections.sort(students);
        System.out.println("Danh sách sinh viên sắp xếp theo điểm số:");
        for (Student student : students) {
            System.out.println(student);
        }
        StudentNameComparator nameComparator = new StudentNameComparator();
        Collections.sort(students, nameComparator);
        System.out.println("\nDanh sách sinh viên sắp xếp theo tên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}