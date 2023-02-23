package service.impl;

import model.LoaiThucPham;
import model.ThucPham;
import repository.IThucPhamRepository;
import repository.impl.ThucPhamRepository;
import service.IThucPhamService;

import java.util.List;

public class ThucPhamService implements IThucPhamService {
    IThucPhamRepository iThucPhamRepository = new ThucPhamRepository();
    @Override
    public List<ThucPham> findAll() {
        return iThucPhamRepository.findAll();
    }

    @Override
    public List<LoaiThucPham> listLoaiThucPham() {
        return iThucPhamRepository.listLoaiThucPham();
    }

    @Override
    public void delete(int id) {
        iThucPhamRepository.delete(id);
    }

    @Override
    public void save(ThucPham thucPham) {
        iThucPhamRepository.save(thucPham);
    }

    @Override
    public ThucPham findById(int id) {
        return iThucPhamRepository.findById(id);
    }
}
