package ss9.bai_tap;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Đào");
        Student student2 = new Student(2, "Trinh");
        Student student3 = new Student(3, "Nghĩa");
        Student student4 = new Student(4, "Trường");
        Student student5 = new Student(5, "Đồng");
        Student student6 = new Student(6, "Duyên");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
        studentMyArrayList.add(student6, 2);
        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }
}
