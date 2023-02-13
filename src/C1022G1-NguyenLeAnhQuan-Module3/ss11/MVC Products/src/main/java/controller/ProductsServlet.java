package controller;

import model.Products;
import service.IProductsService;
import service.iplm.ProductsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductsServlet", value = "/products")
public class ProductsServlet extends HttpServlet {
    private IProductsService iProductsService = new ProductsService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "create":
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String decription = request.getParameter("decription");
                String producer = request.getParameter("producer");
                iProductsService.save(new Products(name,price,decription,producer));
                response.sendRedirect("/products");
                break;
            case "update" :
                int idUpDate = Integer.parseInt(request.getParameter("idUpDate"));
                Products products = iProductsService.findById(idUpDate);
                if(products != null) {
                    String nameUpDate = request.getParameter("nameUpDate");
                    String priceUpDate = request.getParameter("priceUpDate");
                    String decripUpDate = request.getParameter("decripUpDate");
                    String producerUpDate = request.getParameter("producerUpDate");
                    products.setName(nameUpDate);
                    products.setPrice(priceUpDate);
                    products.setDecription(decripUpDate);
                    products.setProducer(producerUpDate);
                    iProductsService.update(products);
                    response.sendRedirect("/products");
                }
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "create":
                request.getRequestDispatcher("/view/create.jsp").forward(request,response);
                break;
            case "update" :
                request.getRequestDispatcher("/view/update.jsp").forward(request,response);
                break;
            default:
                request.setAttribute("productsList",iProductsService.findAll());
                request.getRequestDispatcher("/view/products.jsp").forward(request,response);
        }
    }
    private void showEditForm()
}
