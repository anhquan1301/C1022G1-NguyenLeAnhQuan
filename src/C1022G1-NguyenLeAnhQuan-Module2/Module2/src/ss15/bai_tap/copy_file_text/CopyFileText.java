package ss15.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void readWriteFile(String filePath, String writeFilePath) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        String line = "";
        int count = 0;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(writeFilePath);
            bufferedWriter = new BufferedWriter(fileWriter);
          while ((line = bufferedReader.readLine()) != null){
              bufferedWriter.append(line + "\n");
              count += line.length();
              System.out.println(line);
          }
            System.out.print("Tổng kí tự: "+count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("File không tồn tại hoặc nội dung lỗi!");
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn source file ");
        String path = sc.nextLine();
        String path2 = sc.nextLine();
        readWriteFile(path,path2);
    }
}

