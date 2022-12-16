package ss11.bai_tap.dem_so_lan_xuat_hien_trong_map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự ");
        String str = scanner.nextLine().toUpperCase();
        String arrStr [] = str.split(" ");
        Map<String,Integer> myMap = new java.util.TreeMap<>();
        for (int i = 0; i <arrStr.length ; i++) {
            int count =0;
            for (int j = 0; j <arrStr.length ; j++) {
                if(arrStr[i].equals(arrStr[j])){
                    count++;
                }
            }
            myMap.put(arrStr[i],count);
        }
        System.out.println(myMap);
        for (Map.Entry<String,Integer> entry: myMap.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }
}
