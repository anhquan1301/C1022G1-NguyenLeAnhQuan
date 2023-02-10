import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customerList = new ArrayList<>();

    public void init(){
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://media.thieunien.vn/thumb/uploads/2021/04/15/ve-dep-trong-treo-cua-3-hot-girl-anh-the-khien-dan-mang-tram-tro_2943.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","https://static2.yan.vn/YanNews/202005/202005220338153336-d201bc2e-83e2-4a54-ba90-6760ea4be8f4.png"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","https://znews-photo.zingcdn.me/w1920/Uploaded/qjyyf/2013_12_16/1465166_602063846513506_1429105524_n_1.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Trần Đăng Khoa","https://smartid.vn/templates/pictures/content/Meo_nho_bo_tui_de_chup_anh_the_dep_1.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-20","Hà Nội","https://image.vtc.vn/files/f2/2015/01/26/anh-the-xinh-dep-cua-cac-hot-girl-viet-10.jpg"));

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList",customerList);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
