package Case_Study.FuramaResort.ulti.IOTEXT;

import Case_Study.FuramaResort.model.model.extend_facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RWRoom {
    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\Case_Study\\FuramaResort\\data\\room.csv";
    public static Map<Room,Integer> readFile(){
        Map<Room,Integer> roomMap = new LinkedHashMap<>();
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
                String freeService=temp[6];
                Room room = new Room(serviceCode,name,area,price,maxPeople,typeRent,freeService);
                roomMap.put(room,Integer.parseInt(temp[7]));
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
        return roomMap;
    }
    public static void writeFile(Map<Room,Integer> roomMap) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room, Integer> entry : roomMap.entrySet()) {
                bufferedWriter.write(entry.getKey().formatRoomCSV() + "," + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
