package baitap.quan_li_san_pham.model.repository;

import baitap.quan_li_san_pham.model.model.IPProduct;
import baitap.quan_li_san_pham.model.util.IOFIle;

import java.util.ArrayList;
import java.util.List;

public class IPProductRepositoryIplm implements IIPProductRepository {
    private static List<IPProduct> ipProductList = new ArrayList<>();
    static {
        ipProductList.add(new  IPProduct("01","IphoneX",
                "White","99%","300"));
        ipProductList.add(new  IPProduct("02","Iphone11",
                "Gold","97%","450"));
    }

    @Override
    public void addProduct(IPProduct ipProduct) {
        IOFIle.readFile();
        ipProductList.add(ipProduct);
        IOFIle.writeFile(ipProductList);
    }

    @Override
    public void display() {
        ipProductList = IOFIle.readFile();
        for (IPProduct ipProduct : ipProductList){
            System.out.println(ipProduct);
        }
    }

    @Override
    public IPProduct findByCode(String codeProduct) {
        for (int i=0; i<ipProductList.size();i++){
            if(ipProductList.get(i).getCodeProduct().equals(codeProduct)){
                return ipProductList.get(i);
            }
        }
        return null;
    }

    @Override
    public void delete(String codeProduct) {
        ipProductList = IOFIle.readFile();
        for (int i=0;i<ipProductList.size();i++){
            if(ipProductList.get(i).getCodeProduct().equals(codeProduct)){
                ipProductList.remove(ipProductList.get(i));
                IOFIle.writeFile(ipProductList);
            }
        }
    }
    @Override
    public void editProduct(IPProduct ipProduct) {
        ipProductList = IOFIle.readFile();
        for (int i=0; i<ipProductList.size();i++){
            if(ipProductList.get(i).getCodeProduct().equals(ipProduct.getCodeProduct())){
                ipProductList.set(i,ipProduct);
                IOFIle.writeFile(ipProductList);
            }
        }
    }
}
