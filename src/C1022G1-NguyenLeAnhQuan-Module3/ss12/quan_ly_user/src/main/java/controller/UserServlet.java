package controller;

import model.User;
import service.IUserService;
import service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    private IUserService iUserService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action==null){
            action = "";
        }
        switch (action){
            case "create":
                create(request,response);
                break;
            case "edit":
                edit(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action==null){
            action = "";
        }
        switch (action){
            case "create":
                createForm(request,response);
                break;
            case "edit":
                editForm(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "sort":
                sort(request,response);
            default:
                display(request,response);
        }
    }
    private void display(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("displayList",iUserService.display());
        try {
            request.getRequestDispatcher("/view/display.jsp").forward(request,response);
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
        iUserService.save(new User(name,email,country));
        try {
            response.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createForm(HttpServletRequest request, HttpServletResponse response){
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
        User user = iUserService.findById(id);
        if(user==null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            user.setName(name);
            user.setEmail(email);
            user.setCountry(country);
            iUserService.edit(user);
            try {
                response.sendRedirect("/user");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void editForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        User user = iUserService.findById(id);
        if(user==null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("user",user);
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
        int id = Integer.parseInt(request.getParameter("id"));
        boolean check = iUserService.delete(id);
        String message = "Xóa thành công";
        if(check){
            message = "Xóa không thành công";
        }
        request.setAttribute("message",message);
        display(request,response);
//        try {
//            response.sendRedirect("/user");
//        } catch (IOException e) {
//        e.printStackTrace();
//    }
}
    private void search(HttpServletRequest request, HttpServletResponse response){
        String search = request.getParameter("search");
        request.setAttribute("search",search);
        request.setAttribute("displayList",iUserService.search(search));
        try {
            request.getRequestDispatcher("/view/display.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void sort(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("displayList",iUserService.sort());
        try {
            request.getRequestDispatcher("/view/display.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
