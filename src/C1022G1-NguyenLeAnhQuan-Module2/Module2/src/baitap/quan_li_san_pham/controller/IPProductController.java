package baitap.quan_li_san_pham.controller;

import baitap.quan_li_san_pham.model.model.IPProduct;
import baitap.quan_li_san_pham.model.service.IIPProductService;
import baitap.quan_li_san_pham.model.service.IPProductServiceIplm;

import java.util.Scanner;

public class IPProductController {
    private static IIPProductService productService = new IPProductServiceIplm();

    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quản lí sản phầm Iphone");
            System.out.println("-----------------------");
            System.out.println("1.Thêm sản phẩm \n" +
                    "2.Hiển thị danh sách sản phẩm \n" +
                    "3.Xóa sản phầm bằng mã sản phẩm \n" +
                    "4.Thay đổi thông tin sản phẩm bằng mã sản phẩm \n");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập mã sản phẩm");
                    String code = sc.nextLine();
                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("Nhập màu sản phẩm");
                    String color = sc.nextLine();
                    System.out.println("Nhập loại sản phẩm");
                    String type = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm");
                    String price = sc.nextLine();
                    IPProduct ipProduct = new IPProduct(code,name,color,type,price);
                    productService.addProduct(ipProduct);
                    break;
                case 2:
                    productService.display();
                    break;
            }
        }while (true);
    }
}
