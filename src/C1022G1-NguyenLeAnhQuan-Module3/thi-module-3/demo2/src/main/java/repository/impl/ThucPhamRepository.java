package repository.impl;

import model.LoaiThucPham;
import model.ThucPham;
import repository.BaseRepository;
import repository.IThucPhamRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThucPhamRepository implements IThucPhamRepository {
    @Override
    public List<ThucPham> findAll() {
        List<ThucPham> thucPhamList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select id,ten,ngay_san_xuat,ngay_het_han,ten_loai_thuc_pham,mo_ta_them from thuc_pham tp join loai_thuc_pham ltp on tp.id_loai_thuc_pham = ltp.id_loai_thuc_pham");
            ResultSet resultSet = preparedStatement.executeQuery();
            ThucPham thucPham;
            while (resultSet.next()){
                thucPham = new ThucPham();
                thucPham.setId(resultSet.getInt("id"));
                thucPham.setTen(resultSet.getString("ten"));
                thucPham.setNgaySanXuat(resultSet.getString("ngay_san_xuat"));
                thucPham.setNgayHetHan(resultSet.getString("ngay_het_han"));
                String tenLoaiThucPham = resultSet.getString("ten_loai_thuc_pham");
                LoaiThucPham loaiThucPham = new LoaiThucPham(tenLoaiThucPham);
                thucPham.setLoaiThucPham(loaiThucPham);
                thucPham.setMoTaThem(resultSet.getString("mo_ta_them"));
                thucPhamList.add(thucPham);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return thucPhamList;
    }

    @Override
    public List<LoaiThucPham> listLoaiThucPham() {
        List<LoaiThucPham> loaiThucPhamList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = BaseRepository.getConnection().prepareStatement("select * from loai_thuc_pham");
            ResultSet resultSet = preparedStatement.executeQuery();
            LoaiThucPham loaiThucPham;
            while (resultSet.next()){
                loaiThucPham = new LoaiThucPham();
                loaiThucPham.setIdLoaiThucPham(resultSet.getInt("id_loai_thuc_pham"));
                loaiThucPham.setTenLoaiThucPham(resultSet.getString("ten_loai_thuc_pham"));
                loaiThucPhamList.add(loaiThucPham);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return loaiThucPhamList;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("delete from thuc_pham where id=?;");
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void save(ThucPham thucPham) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("insert into thuc_pham(ten,ngay_san_xuat,ngay_het_han,id_loai_thuc_pham,mo_ta_them) values(?,?,?,?,?) ");
            preparedStatement.setString(1,thucPham.getTen());
            preparedStatement.setString(2,thucPham.getNgaySanXuat());
            preparedStatement.setString(3,thucPham.getNgayHetHan());
            preparedStatement.setInt(4,thucPham.getLoaiThucPham().getIdLoaiThucPham());
            preparedStatement.setString(5,thucPham.getMoTaThem());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ThucPham findById(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement("select id,ten,ngay_san_xuat,ngay_het_han,ten_loai_thuc_pham,mo_ta_them from thuc_pham tp join loai_thuc_pham ltp on tp.id_loai_thuc_pham = ltp.id_loai_thuc_pham where id=?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            ThucPham thucPham;
            while (resultSet.next()){
                thucPham = new ThucPham();
                thucPham.setId(resultSet.getInt("id"));
                thucPham.setTen(resultSet.getString("ten"));
                thucPham.setNgaySanXuat(resultSet.getString("ngay_san_xuat"));
                thucPham.setNgayHetHan(resultSet.getString("ngay_het_han"));
                String tenLoaiThucPham = resultSet.getString("ten_loai_thuc_pham");
                LoaiThucPham loaiThucPham = new LoaiThucPham(tenLoaiThucPham);
                thucPham.setLoaiThucPham(loaiThucPham);
                thucPham.setMoTaThem(resultSet.getString("mo_ta_them"));
                return thucPham;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
