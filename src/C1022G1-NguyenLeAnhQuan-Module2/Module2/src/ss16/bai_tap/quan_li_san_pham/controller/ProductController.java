package ss16.bai_tap.quan_li_san_pham.controller;

import ss16.bai_tap.quan_li_san_pham.model.model.Product;
import ss16.bai_tap.quan_li_san_pham.model.service.IProductService;
import ss16.bai_tap.quan_li_san_pham.model.service.ProductService;
import ss16.bai_tap.quan_li_san_pham.ulti.ProductFile;

import java.util.Scanner;

public class ProductController {
    private static IProductService ip;

    public ProductController() {
    }
    public ProductController(IProductService ip) {
        this.ip=ip;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Quản lí sản phẩm-----");
        System.out.println("--------------------------");
        System.out.println("1.Thêm sản phẩm vào danh sách \n" +
                        "2.Hiển thị danh sách sản phẩm \n" +
                        "3.Tìm kiếm thông tin sản phẩm theo tên \n" +
                        "4.Thoát"
        );
        do {
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập id sản phẩm");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("Nhập tên hãn sản xuất");
                    String producer = sc.nextLine();
                    System.out.println("Nhập màu sản phẩm");
                    String color = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product = new Product(id,name,producer,color,price);
                    ip.addProduct(product);
                    break;
                case 2:
                    ip.displayProduct();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm");
                    String nameSearch = sc.nextLine();
                    ip.searchProduct(nameSearch);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập sai cú pháp");
            }
        }while (true);
    }
}
