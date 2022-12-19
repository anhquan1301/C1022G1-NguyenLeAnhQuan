package ss11.bai_tap.mo_hinh_MVC.controller;

import ss11.bai_tap.mo_hinh_MVC.model.model.Product;
import ss11.bai_tap.mo_hinh_MVC.model.service.IProductService;
import ss11.bai_tap.mo_hinh_MVC.model.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final IProductService productService = new ProductService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Quản Lí Sản Phẩm-----");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên");
        System.out.println("6. Sắp xếp sản phẩm tăng dần");
        System.out.println("7. Sắp xếp sản phẩm giảm dần");
        System.out.println("8. Thoát");
        System.out.println("Chọn số để thực hiện các bước trên");
        do {
            int selection = Integer.parseInt(scanner.nextLine());
            switch (selection){
                case 1:
                    System.out.print("Nhâp id sản phẩm: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    int price =  Integer.parseInt(scanner.nextLine());
                    productService.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập id cần chỉnh sửa thông tin: ");
                    int idFixed = Integer.parseInt(scanner.nextLine());
                    Product newId = productService.findById(idFixed);
                    if(newId != null){
                        System.out.print("Nhập tên mới của sản phẩm: ");
                        String nameNew = scanner.nextLine();
                        System.out.print("Nhập giá mới của sản phẩm: ");
                        int priceNew = Integer.parseInt(scanner.nextLine());
                        newId.setName(nameNew);
                        newId.setPrice(priceNew);
                        productService.updateProduct(newId);
                    }

                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    productService.removeProduct(id1);
                    break;
                case 4:
                    productService.displayProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm: ");
                    String nameProduct = scanner.nextLine();
                    productService.searchProduct(nameProduct);
                    break;
                case 6:
                    productService.sortAscending();
                    break;
                case 7:
                    productService.sortDescending();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập lại lựa chọn");
            }
        }while (true);
    }
}
