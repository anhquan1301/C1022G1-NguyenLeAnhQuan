package baitap.quan_li_san_pham.model.service;

import baitap.quan_li_san_pham.model.model.IPProduct;

public interface IIPProductService {
    void addProduct(IPProduct ipProduct);
    void display();
    IPProduct findByCode(String codeProduct);
    void delete(String codeProduct);
    void editProduct(IPProduct ipProduct);
}
