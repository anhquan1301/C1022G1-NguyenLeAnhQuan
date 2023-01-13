use casestudy_furama;
-- Truy vấn dữ liệu Furama
-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien
where (substring_index(ho_ten," ",-1) like "H%" or
substring_index(ho_ten," ",-1) like "Y%" or
substring_index(ho_ten," ",-1) like "K%")
and length(ho_ten) <=16;
-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
where (dia_chi like "% Đà Nẵng" or
 dia_chi like "% Quảng Trị") and
(year(curdate()) - year(ngay_sinh) between 18 and 50);
-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”
select khach_hang.ma_khach_hang, ho_ten, count(khach_hang.ma_khach_hang)"Số lần đặt phòng" from khach_hang
join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang 
join loai_khach on loai_khach.ma_loai_khach =  khach_hang.ma_loai_khach
where ten_loai_khach = "Diamond"
group by khach_hang.ma_khach_hang
order by count(khach_hang.ma_khach_hang);
-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, 
-- tong_tien (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, 
-- với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
set sql_mode=(select replace(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select khach_hang.ma_khach_hang,ho_ten,ten_loai_khach,hop_dong.ma_hop_dong,
ten_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,sum((dich_vu.chi_phi_thue + ifnull((hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia), 0))) as "Tổng tiền"
from khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join dich_vu_di_kem on  dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
group by khach_hang.ma_khach_hang
order by khach_hang.ma_khach_hang;
