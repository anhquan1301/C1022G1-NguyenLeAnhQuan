CREATE SCHEMA quan_li_sinh_vien;
USE quan_li_sinh_vien;
CREATE TABLE class (
  class_id INT PRIMARY KEY AUTO_INCREMENT, 
  class_name VARCHAR(50) NOT NULL, 
  start_date DATETIME NOT NULL, 
  `status` BIT
);
CREATE TABLE student (
  student_id INT PRIMARY KEY AUTO_INCREMENT, 
  student_name VARCHAR(50) NOT NULL, 
  address VARCHAR(50), 
  phone VARCHAR(50), 
  `status` BIT, 
  class_id INT NOT NULL, 
  FOREIGN KEY (class_id) REFERENCES class (class_id)
);
CREATE TABLE `subject` (
  sub_id INT PRIMARY KEY AUTO_INCREMENT, 
  sub_name VARCHAR(50) NOT NULL, 
  credit TINYINT NOT NULL DEFAULT 1 CHECK (credit >= 1), 
  `status` BIT DEFAULT 1
);
CREATE TABLE mark (
  mark_id INT PRIMARY KEY AUTO_INCREMENT, 
  sub_id INT NOT NULL, 
  student_id INT NOT NULL, 
  mark FLOAT DEFAULT 0 CHECK (
    mark BETWEEN 0 
    AND 100
  ), 
  exam_times TINYINT DEFAULT 1, 
  FOREIGN KEY (sub_id) REFERENCES `subject` (sub_id), 
  FOREIGN KEY (student_id) REFERENCES student (student_id)
);
-- drop schema quan_li_sinh_vien;
-- Nhập dữ liệu vào bảng  
insert into class(class_name, start_date, `status`) 
values 
  ("A1", "2008-12-20", 1), 
  ("A2", "2008-12-22", 1), 
  (
    "B3", 
    current_date(), 
    0
  );
insert into student(
  student_name, address, phone, `status`, 
  class_id
) 
values 
  (
    'Hung', 'Ha Noi', '0912113113', 1, 
    1
  ), 
  (
    'Hoa', 'Hai phong', '0909999999', 
    1, 1
  ), 
  ('Manh', 'HCM', '0123123123', 0, 2);
insert into `subject`(sub_name, credit, `status`) 
values 
  ('CF', 5, 1), 
  ('C', 6, 1), 
  ('HDJ', 5, 1), 
  ('RDBMS', 10, 1);
insert into mark(
  sub_id, student_id, mark, exam_times
) 
values 
  (1, 1, 8, 1), 
  (1, 2, 10, 2), 
  (2, 1, 12, 1);
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’ 
SELECT 
  * 
FROM 
  student 
WHERE 
  student_name LIKE 'h%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
SELECT 
  * 
FROM 
  class 
WHERE 
  MONTH(start_date) = 12;
-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT 
  * 
FROM 
  `subject` 
WHERE 
  credit >= 3 
  AND credit <= 5;
-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
UPDATE 
  student 
SET 
  class_id = 2 
WHERE 
  student_name = 'Hung';
-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
SELECT 
  student.student_name, 
  `subject`.sub_name, 
  mark.mark 
FROM 
  mark 
  INNER JOIN student ON mark.student_id = student.student_id 
  INNER JOIN `subject` ON mark.sub_id = `subject`.sub_id 
ORDER BY 
  mark.mark DESC, 
  student.student_name;