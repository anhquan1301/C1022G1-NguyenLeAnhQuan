package ss15.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        String line = "";
        int sum = 0;
        File file = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(filePath);
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Tổng: " + sum);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi! ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file: ");
        String path = sc.nextLine();
        ReadFileExample readFileExample = new  ReadFileExample();
        readFileExample.readFileText(path);
    }
}
