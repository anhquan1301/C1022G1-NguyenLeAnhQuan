USE quan_li_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT 
    *
FROM
    `subject`
WHERE
    credit = (SELECT 
            MAX(credit)
        FROM
            `subject`);
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT 
    *
FROM
    `subject`
        JOIN
    mark ON `subject`.sub_id = mark.sub_id
WHERE
    mark = (SELECT 
            MAX(mark)
        FROM
            mark);
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT 
    student_name, AVG(mark)
FROM
    student
        JOIN
    mark ON student.student_id = mark.student_id
GROUP BY student.student_id
ORDER BY AVG(mark) DESC;

