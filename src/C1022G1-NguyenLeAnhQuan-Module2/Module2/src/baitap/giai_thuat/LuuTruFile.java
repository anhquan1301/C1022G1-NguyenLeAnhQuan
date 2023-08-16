package baitap.giai_thuat;

public class LuuTruFile {
    public static void main(String[] args) {
            int fileSize = 8193;
            int num = fileSize/1000;
            int num1  = fileSize % 1000;
            int rs = 4;
            int count=0;
            while (num >= Math.pow(2,count)){
                rs = (int) Math.pow(2,count);
                    count++;
            }
            if(fileSize<4096){
                rs=4;
            }else {
                if((double) num1/ (double) rs > 24 ){
                    rs = rs*2;
                }
            }

//        System.out.println( (int) Math.ceil((double) fileSize / 4096 ) * 4);
    }
}
