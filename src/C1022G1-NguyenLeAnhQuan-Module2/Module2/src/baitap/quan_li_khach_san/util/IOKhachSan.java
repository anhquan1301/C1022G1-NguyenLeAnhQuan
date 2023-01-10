package baitap.quan_li_khach_san.util;

import baitap.quan_li_khach_san.model.model.KhachSan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOKhachSan {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\baitap\\quan_li_khach_san\\data\\khachsan.csv";

    public static List<KhachSan> readFile(){
        List<KhachSan> khachSanList = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String temp[] = line.split(",");
                khachSanList.add(new KhachSan(temp[0],temp[1],temp[2],temp[3],temp[4]));
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
        return khachSanList;
    }
    public static void writeFile(List<KhachSan> khachSanList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (KhachSan khachSan : khachSanList){
                bufferedWriter.write(khachSan.formatCSV());
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
    public static void writeFile2(List<KhachSan> khachSanList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (KhachSan khachSan : khachSanList){
                bufferedWriter.write(khachSan.formatCSV());
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
