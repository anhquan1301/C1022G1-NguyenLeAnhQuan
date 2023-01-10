package baitap.quan_li_san_pham.model.util;

import baitap.quan_li_san_pham.model.model.IPProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFIle {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\baitap\\quan_li_san_pham\\model\\data\\IPProduct.csv";

    public static List<IPProduct> readFile(){
        List<IPProduct> ipProducts = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                ipProducts.add(new IPProduct(temp[0],temp[1],temp[2],temp[3],temp[4]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ipProducts;
    }
    public static void writeFile(List<IPProduct> ipProducts){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (IPProduct ipProduct : ipProducts){
                bufferedWriter.write(ipProduct.formatCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeFile1(List<IPProduct> ipProducts){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (IPProduct ipProduct : ipProducts){
                bufferedWriter.write(ipProduct.formatCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
