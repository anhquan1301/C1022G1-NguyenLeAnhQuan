package controller;

import model.Class;
import model.Student;
import service.IStudenService;
import service.impl.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private IStudenService iStudenService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
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
            case "showClassList":
                showClassList(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            action = "";
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
        request.setAttribute("search",name);
        request.setAttribute("studentList",iStudenService.search(name));
        request.getRequestDispatcher("/view/list.jsp").forward(request,response);
    }
    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        double score = Double.parseDouble(request.getParameter("score"));
        int cName = Integer.parseInt(request.getParameter("className"));
        iStudenService.create(name,score,cName);
        response.sendRedirect("/student");
    }
    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("studentList",iStudenService.search(""));
        request.setAttribute("classList",iStudenService.search());
        request.getRequestDispatcher("/view/create.jsp").forward(request,response);
    }
    private void showClassList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("classList",iStudenService.search());
        request.getRequestDispatcher("/view/classList.jsp").forward(request,response);
    }
    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = iStudenService.findById(id);
        String name = request.getParameter("name");
        double score = Double.parseDouble(request.getParameter("score"));
        int cId = Integer.parseInt(request.getParameter("classId"));
        Class classId = new Class(cId);
        if(student!=null){
            student.setId(id);
            student.setName(name);
            student.setScore(score);
            student.setClassName(classId);
            iStudenService.edit(student);

        try {
            response.sendRedirect("/student");
        } catch (IOException e) {
            throw new RuntimeException(e);
            }
        }
    }
    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = iStudenService.findById(id);
        if (student!=null){
            request.setAttribute("studentList",student);
            request.setAttribute("classList",iStudenService.search());
            request.getRequestDispatcher("/view/edit.jsp").forward(request,response);
        }
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = iStudenService.findById(id);
        if(student!=null){
            iStudenService.delete(id);
            response.sendRedirect("/student");
        }
    }
}
