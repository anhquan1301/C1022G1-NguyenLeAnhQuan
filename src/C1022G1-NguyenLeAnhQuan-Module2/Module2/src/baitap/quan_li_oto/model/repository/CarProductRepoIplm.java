package baitap.quan_li_oto.model.repository;

import Case_Study.FuramaResort.model.repository.itf.ICustomerRepository;
import baitap.quan_li_oto.model.model.CarProduct;
import baitap.quan_li_oto.util.RWText;

import java.util.ArrayList;
import java.util.List;

public class CarProductRepoIplm implements ICarProductRepo {
private static List<CarProduct> carProductList = new ArrayList<>();

    @Override
    public void hienThiDanhSachXe() {
        carProductList = RWText.readFile();
        for (CarProduct carProduct : carProductList){
            System.out.println(carProduct);
        }
    }

    @Override
    public void themMoiXe(CarProduct carProduct) {
        carProductList.clear();
        carProductList.add(carProduct);
        RWText.writeFile(carProductList);
    }

    @Override
    public void timKiemTheoTen(String name) {
        carProductList = RWText.readFile();
        for (int i=0; i<carProductList.size();i++){
            if(carProductList.get(i).getTenXe().contains(name)){
                System.out.println(carProductList.get(i));
            }
        }
    }

    @Override
    public CarProduct timKiemMa(String maXe) {
        carProductList = RWText.readFile();
        for (int i = 0; i <carProductList.size() ; i++) {
            if(carProductList.get(i).getMaXe().equals(maXe)){
                return carProductList.get(i);
            }
        }
        return null;
    }

    @Override
    public void chinhSuaThongTin(CarProduct carProduct) {
        carProductList = RWText.readFile();
        for (int i=0; i<carProductList.size();i++){
            if(carProductList.get(i).getMaXe().equals(carProduct.getMaXe())){
                carProductList.set(i,carProduct);
                RWText.writeFile2(carProductList);
            }
        }
    }
}
