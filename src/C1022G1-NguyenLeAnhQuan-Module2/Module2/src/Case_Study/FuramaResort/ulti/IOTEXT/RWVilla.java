package Case_Study.FuramaResort.ulti.IOTEXT;

import Case_Study.FuramaResort.model.model.extend_facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWVilla {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\Case_Study\\FuramaResort\\data\\villa.csv";

    public static Map<Villa,Integer> readFile(){
        Map<Villa,Integer> villaMap = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader =  null;
        try{
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            while ((line = bufferedReader.readLine())!=null){
                temp = line.split(",");
                String serviceCode = temp[0];
                String name = temp[1];
                String area = temp[2];
                String price = temp[3];
                String maxPeople = temp[4];
                String typeRent = temp[5];
                String quality = temp[6];
                String areaPool = temp[7];
                String numberFloors = temp[8];
                Villa villa = new Villa(serviceCode,name,area,price,maxPeople,typeRent,quality,areaPool,numberFloors);
                villaMap.put(villa,Integer.parseInt(temp[9]));
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
        return villaMap;
    }
    public static void writeFile(Map<Villa,Integer> villaMap){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa,Integer> entry : villaMap.entrySet()){
                bufferedWriter.write(entry.getKey().formatCSVVilla() + "," + entry.getValue());
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
