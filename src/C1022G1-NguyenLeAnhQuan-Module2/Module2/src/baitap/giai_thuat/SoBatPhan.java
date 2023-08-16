package baitap.giai_thuat;

public class SoBatPhan {
    public static void main(String[] args) {
        int soThapPhan = 142;
        int soDu = 0;
        StringBuilder ketqua = new StringBuilder();
        while (soThapPhan!=0){
            soDu = soThapPhan%8;
            soThapPhan = soThapPhan/8;
            ketqua.append(soDu);
        }
        System.out.println(ketqua.reverse());
    }
}
