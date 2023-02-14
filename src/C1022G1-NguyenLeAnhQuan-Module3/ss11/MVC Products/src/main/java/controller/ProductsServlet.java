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
                showCreate(request,response);
                break;
            case "update" :
                showUpdate(request,response);
                break;
            case "delete":
                showDelete(request,response);
                break;
            case "search":
                showSearch(request,response);
                break;
            default:
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
                showCreateForm(request,response);
                break;
            case "update" :
                showUpdateForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            default:
                request.setAttribute("products",iProductsService.findAll());
                request.getRequestDispatcher("/view/products.jsp").forward(request,response);
        }
    }
    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Products products = iProductsService.findById(id);
        if(products==null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("products", products);
            try {
                request.getRequestDispatcher("/view/update.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void showUpdate(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Products products = iProductsService.findById(id);
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String decription = request.getParameter("decription");
        String producer = request.getParameter("producer");
        if(products==null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            products.setName(name);
            products.setPrice(price);
            products.setDecription(decription);
            products.setProducer(producer);
            iProductsService.update(products);
//            request.setAttribute("products",products);
            try {
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void showCreate(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String decription = request.getParameter("decription");
        String producer = request.getParameter("producer");
        iProductsService.save(new Products(name,price,decription,producer));
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Products products = iProductsService.findById(id);
        if (products == null) {
            request.getRequestDispatcher("error-404.jsp");
        }else {
            iProductsService.delete(products);
            request.setAttribute("products", products);
            try {
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Products products = iProductsService.findById(id);
        if (products == null) {
            request.getRequestDispatcher("error-404.jsp");
        }else {
            try {
                request.getRequestDispatcher("/view/delete.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void showSearch(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        Products products = iProductsService.search(name);
        if (products == null) {
            request.getRequestDispatcher("error-404.jsp");
        }else {
            try {
                request.setAttribute("products",products);
                request.getRequestDispatcher("/view/search.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
