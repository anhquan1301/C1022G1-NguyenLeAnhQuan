package baitap.quan_li_oto.util;

import baitap.quan_li_oto.model.model.CarProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWText {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\baitap\\quan_li_oto\\data\\CarFile.csv";

    public static List<CarProduct> readFile(){
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        List<CarProduct> carProducts = new ArrayList<>();
        try{
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String temp [] = line.split(",");
                carProducts.add(new CarProduct(temp[0],temp[1],temp[2],temp[3],temp[4]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return carProducts;
    }
    public static void writeFile(List<CarProduct> carProductList){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CarProduct carProduct : carProductList){
                bufferedWriter.write(carProduct.formatCSV());
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
    public static void writeFile2(List<CarProduct> carProductList){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CarProduct carProduct : carProductList){
                bufferedWriter.write(carProduct.formatCSV());
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
