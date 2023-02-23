package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService iCustomerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
            case "delele":
                break;
            default:

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if(action==null){
            action = "";
        }
        switch (action){
            case "create":
                showCreate(request,response);
                break;
            case "edit":
                showEdit(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                showList(request,response);

        }
    }
   private void showList(HttpServletRequest request, HttpServletResponse response){
        String search = request.getParameter("search");
        request.setAttribute("customerList",iCustomerService.showList(search));
       try {
           request.getRequestDispatcher("/view/list.jsp").forward(request,response);
       } catch (ServletException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   private void create(HttpServletRequest request, HttpServletResponse response){
       String name = request.getParameter("name");
       String email = request.getParameter("email");
       String country = request.getParameter("country");
       String typeSong = request.getParameter("typeSong");
       iCustomerService.save(new Customer(name,email,country,typeSong));
       try {
           response.sendRedirect("/customer");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   private void showCreate(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("customerList",iCustomerService.showList(""));
       try {
           request.getRequestDispatcher("/view/create.jsp").forward(request,response);
       } catch (ServletException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   private void edit(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String typeSong = request.getParameter("typeSong");
        Customer customer = iCustomerService.findById(id);
        if(customer == null){
            request.getRequestDispatcher("error-404.jsp");
        }
        else {
        customer.setName(name);
        customer.setEmail(email);
        customer.setCountry(country);
        customer.setTypeSong(typeSong);
        iCustomerService.edit(customer);
       }
       try {
           response.sendRedirect("/customer");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   private void showEdit(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.findById(id);
       if(customer == null){
           request.getRequestDispatcher("error-404.jsp");
       }else {
            request.setAttribute("customer",customer);
            try {
                request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
   }
   private void delete(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("deleteId"));
        iCustomerService.delete(id);
       try {
           response.sendRedirect("/customer");
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
