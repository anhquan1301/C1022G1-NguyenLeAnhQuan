USE casestudy_furama;
-- Truy vấn dữ liệu Furama
-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
SELECT 
    *
FROM
    nhan_vien
WHERE
    (SUBSTRING_INDEX(ho_ten, ' ', - 1) LIKE 'H%'
        OR SUBSTRING_INDEX(ho_ten, ' ', - 1) LIKE 'Y%'
        OR SUBSTRING_INDEX(ho_ten, ' ', - 1) LIKE 'K%')
        AND LENGTH(ho_ten) <= 16;
-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT 
    *
FROM
    khach_hang
WHERE
    (dia_chi LIKE '% Đà Nẵng'
        OR dia_chi LIKE '% Quảng Trị')
        AND (YEAR(CURDATE()) - YEAR(ngay_sinh) BETWEEN 18 AND 50);
-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”
SELECT 
    khach_hang.ma_khach_hang,
    ho_ten,
    COUNT(khach_hang.ma_khach_hang) 'Số lần đặt phòng'
FROM
    khach_hang
        JOIN
    hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        JOIN
    loai_khach ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
WHERE
    ten_loai_khach = 'Diamond'
GROUP BY khach_hang.ma_khach_hang
ORDER BY COUNT(khach_hang.ma_khach_hang);
-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, 
-- tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, 
-- với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
set sql_mode=(select replace(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT 
    khach_hang.ma_khach_hang,
    ho_ten,
    ten_loai_khach,
    hop_dong.ma_hop_dong,
    ten_dich_vu,
    ngay_lam_hop_dong,
    ngay_ket_thuc,
    SUM((dich_vu.chi_phi_thue + IFNULL((hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia),
            0))) 'Tổng tiền'
FROM
    khach_hang
        JOIN
    loai_khach ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
        JOIN
    hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        JOIN
    dich_vu ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
        JOIN
    hop_dong_chi_tiet ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
        JOIN
    dich_vu_di_kem ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
GROUP BY khach_hang.ma_khach_hang
ORDER BY khach_hang.ma_khach_hang;
