package baitap.java;

public class ThamTriThamChieu {
    public static void thamTri(int a,int b){
        System.out.println(a); // Kết quả: 10
        System.out.println(b); // Kết quả: 5
        int temp = a;
            a = b;
            b = temp;
        System.out.println(a); // Kết quả: 5
        System.out.println(b); // Kết quả: 10
    }
    public static void thamChieu(StringBuilder a){
        System.out.println(a); // Kết quả: abc
        StringBuilder b = new StringBuilder("mng");
        a = b;
        System.out.println(a); // mng
    }
    public static void main(String[] args) {
        // Tham trị và Tham chiếu
        // Tham trị:   +Sử dụng cho kiểu nguyên thủy
        //             +Tham số sao chép giá trị của đối số. Nên mọi sự
        //             thay đổi của tham số không làm ảnh hưởng đến đối số.
        // Tham chiếu: +Sử dụng cho kiểu đối tượng.
        //             +Tham số và đối số cùng chiếu đn 1 địa chỉ ở vùng nhớ heap.
        //              Nên mọi sự thay đổi của tham số sẽ ảnh hưởng đến đối số.

        // DEMO THAM TRỊ
        int a = 10;
        int b = 5;
        thamTri(a,b);
        System.out.println(a); // Kết quả: 10
        System.out.println(b); // Kết quả: 5
        StringBuilder str = new StringBuilder("abc");
        thamChieu(str);
        System.out.println(str); // Kết quả: abc
        // Java truyền tham trị
        // Lí do Java truyền tham trị là đơn giản hóa độ phức tạp.
        // Nếu Java cho phép truyền tham trị, nghĩa là tham số có thể được thay
        // đổi bên trong phương thức và ảnh hưởng đến giá trị gốc. Điều này có
        // thể gây ra các vấn đề bảo mật và khó khăn trong việc theo dõi và hiểu code.
    }
}
