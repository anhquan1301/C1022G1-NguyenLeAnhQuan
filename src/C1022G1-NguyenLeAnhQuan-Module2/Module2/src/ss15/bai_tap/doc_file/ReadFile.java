package ss15.bai_tap.doc_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\ss15\\bai_tap\\doc_file\\NationList.csv";

    public static List<NationList> readlistFile(){
        List<NationList> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        String temp [];
        NationList nationList;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            while ((line= bufferedReader.readLine())!=null){
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                nationList = new NationList(id, code, name);
                list.add(nationList);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<NationList> nationLists = readlistFile();
        for (NationList nationList : nationLists){
            System.out.println(nationList);
        }
     }
}
