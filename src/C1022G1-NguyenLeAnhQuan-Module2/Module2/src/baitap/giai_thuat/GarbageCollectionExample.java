package baitap.giai_thuat;

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person object " + name + " has been garbage collected.");
    }
}

public class GarbageCollectionExample {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");

        person1 = null; // Đặt person1 thành null để không còn tham chiếu đến đối tượng
        person2 = null; // Đặt person2 thành null để không còn tham chiếu đến đối tượng

        System.gc(); // Yêu cầu bộ thu gom rác

        // Tiếp tục thực hiện công việc khác
        System.out.println("Continuing with other tasks...");
    }
}