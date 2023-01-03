package Case_Study.FuramaResort.ulti.IOTEXT;

import Case_Study.FuramaResort.model.model.extend_person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWEmployee {

    public static final String FILE_PATH = "D:\\Codegym\\C1022G1-NguyenLeAnhQuan\\bai_tap\\src\\C1022G1-NguyenLeAnhQuan-Module2\\Module2\\src\\Case_Study\\FuramaResort\\data\\employee.csv";

    public static List<Employee> readFile(){
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee1;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                String id = temp[0];
                String name = temp[1];
                String date = temp[2];
                String gender = temp[3];
                String cMND = temp[4];
                String phone = temp[5];
                String email = temp[6];
                String level = temp[7];
                String position = temp[8];
                String salary = temp[9];
                employee1 = new  Employee(id, name, date, gender, cMND, phone, email, level, position, salary);
                employeeList.add(employee1);
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
        return  employeeList;
    }
    public static void writerFileAppend(List<Employee> employeeList){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList){
                bufferedWriter.write(employee.formatCSVEmployee());
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
    public static void writerFileNotAppend(List<Employee> employeeList){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList){
                bufferedWriter.write(employee.formatCSVEmployee());
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
