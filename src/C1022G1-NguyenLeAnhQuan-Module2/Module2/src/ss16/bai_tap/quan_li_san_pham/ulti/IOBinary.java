package ss16.bai_tap.quan_li_san_pham.ulti;

import ss16.bai_tap.quan_li_san_pham.model.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOBinary {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\ss16\\bai_tap\\quan_li_san_pham\\data\\abc.csv";

    public List<Product> readFile(){
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream =null;
        ObjectInputStream objectInputStream = null;
        try{
            fileInputStream = new FileInputStream(FILE_PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }
    public void writeFile(List<Product> productList){
        FileOutputStream fileOutputStream =null;
        ObjectOutputStream objectOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(FILE_PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
