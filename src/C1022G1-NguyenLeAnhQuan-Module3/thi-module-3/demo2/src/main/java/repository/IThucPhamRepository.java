package repository;

import model.LoaiThucPham;
import model.ThucPham;

import java.util.List;

public interface IThucPhamRepository {
    List<ThucPham> findAll();
    List<LoaiThucPham> listLoaiThucPham();
    void delete(int id);
    void save(ThucPham thucPham);
    ThucPham findById(int id);
}
