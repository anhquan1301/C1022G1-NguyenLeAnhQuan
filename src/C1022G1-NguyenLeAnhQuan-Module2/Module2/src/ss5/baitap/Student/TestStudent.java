package ss5.baitap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Đào", "C1022G1");
        System.out.println(st1.getName());
        System.out.println(st1.getClasses());
        System.out.println(st2.getName());
        System.out.println(st2.getClasses());
//        System.out.println(st2.toString());
    }
}
