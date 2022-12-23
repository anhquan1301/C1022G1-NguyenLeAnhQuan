package ss16.bai_tap.quan_li_san_pham.ulti;

import ss16.bai_tap.quan_li_san_pham.controller.ProductController;
import ss16.bai_tap.quan_li_san_pham.model.model.Product;

import java.io.*;
import java.util.List;

public class ProductFile {
    private static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\ss16\\bai_tap\\quan_li_san_pham\\data\\ProductFile.dat";
    public static void writeListFile(List<Product> productList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static List<Product> readListFile(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<Product> productList = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
}
