package controller;

import model.LoaiThucPham;
import model.ThucPham;
import service.IThucPhamService;
import service.impl.ThucPhamService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ThucPhamServlet", value = "/thucpham")
public class ThucPhamServlet extends HttpServlet {
    IThucPhamService iThucPhamService = new ThucPhamService();
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
            default:
                showListThucPham(request,response);

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
            case "delele":
                break;
            default:

        }
    }
    private void showListThucPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listThucPham",iThucPhamService.findAll());
        request.getRequestDispatcher("/view/list.jsp").forward(request,response);
    }
    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listLoaiThucPham",iThucPhamService.listLoaiThucPham());
        request.getRequestDispatcher("/view/create.jsp").forward(request,response);
    }
    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ten = request.getParameter("ten");
        String ngaySanXuat = request.getParameter("ngaySanXuat");
        String ngayHetHan = request.getParameter("ngayHetHan");
        int idLoaiThucPham = Integer.parseInt(request.getParameter("idLoaiThucPham"));
        LoaiThucPham loaiThucPham = new LoaiThucPham(idLoaiThucPham);
        String moTaThem = request.getParameter("moTaThem");
        ThucPham thucPham = new ThucPham(ten,ngaySanXuat,ngayHetHan,loaiThucPham,moTaThem);
        iThucPhamService.save(thucPham);
        response.sendRedirect("/thucpham");
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
            iThucPhamService.delete(id);
        response.sendRedirect("/thucpham");
    }
}
