package baitap.quan_li_san_pham.model.service;

import baitap.quan_li_san_pham.model.model.IPProduct;
import baitap.quan_li_san_pham.model.repository.IIPProductRepository;
import baitap.quan_li_san_pham.model.repository.IPProductRepositoryIplm;

public class IPProductServiceIplm implements IIPProductService {
    private static IIPProductRepository productRepository = new IPProductRepositoryIplm();
    @Override
    public void addProduct(IPProduct ipProduct) {
        productRepository.addProduct(ipProduct);
    }

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public IPProduct findByCode(String codeProduct) {
        return productRepository.findByCode(codeProduct);
    }

    @Override
    public void delete(String codeProduct) {
        productRepository.delete(codeProduct);
    }

    @Override
    public void editProduct(IPProduct ipProduct) {
        productRepository.editProduct(ipProduct);
    }
}
