import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Calculator", value = "/calculator")
public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productdescription");
        double listPrice = Double.parseDouble(request.getParameter("listprice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountpercent"));
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice-discountAmount;
        request.setAttribute("productdescription", productDescription);
        request.setAttribute("listprice", listPrice);
        request.setAttribute("discountpercent", discountPercent);
        request.setAttribute("discountamount", discountAmount);
        request.setAttribute("discountprice", discountPrice);
        request.getRequestDispatcher("/discount_servlet.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
