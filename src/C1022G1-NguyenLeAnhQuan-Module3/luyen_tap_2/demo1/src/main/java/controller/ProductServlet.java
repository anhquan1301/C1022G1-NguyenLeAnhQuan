package controller;

import model.Product;
import model.TypeProduct;
import service.IProductService;
import service.iplm.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    IProductService iProductService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                showCreate(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            case "edit":
                showEdit(request,response);
                break;
            default:
                showList(request,response);
        }
    }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
            case "delete":
                break;
            case "edit":
                edit(request,response);
                break;
            default:

        }
    }
    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("search");
        request.setAttribute("name",name);
        request.setAttribute("productList",iProductService.findAll(name));
        request.getRequestDispatcher("/view/list.jsp").forward(request,response);

    }
    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int idTypeProduct = Integer.parseInt(request.getParameter("idTypeProduct"));
        TypeProduct typeProduct = new TypeProduct(idTypeProduct);
        Product product = new Product(name,price,typeProduct);
        iProductService.save(product);
        response.sendRedirect("/product");
    }
    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("typeProductList",iProductService.typeProductList());
        request.getRequestDispatcher("/view/create.jsp").forward(request,response);
    }
    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.findById(id);
        if(product!=null) {
            request.setAttribute("productList",product);
            request.setAttribute("typeProductList", iProductService.typeProductList());
            request.getRequestDispatcher("/view/edit.jsp").forward(request, response);
        }
    }
    private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        int idTypeProduct = Integer.parseInt(request.getParameter("idTypeProduct"));
        TypeProduct typeProduct = new TypeProduct(idTypeProduct);
        Product product = new Product(id,name,price,typeProduct);
        iProductService.edit(product);
        response.sendRedirect("/product");
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.findById(id);
        if(product!=null){
            iProductService.delete(id);
            response.sendRedirect("/product");
        }
    }
}
