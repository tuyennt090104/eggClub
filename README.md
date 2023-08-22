https://viblo.asia/p/tuot-tuon-tuot-ve-jdbc-gAm5yjzEKdb

https://viblo.asia/p/maven-apache-3wjAM7WyMmWe

mvn install:install-file -Dfile=<path-to-file> -DgroupId=<group-id> -DartifactId=<artifact-id> -Dversion=<version> -Dpackaging=<packaging>

https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html

* tìm hiểu
- tìm hiểu khóa chính, khóa phụ 
- các chuẩn trong sql 1nf, 2nf, 3nf... 
- left join, right jon, inner join, outer join, all join, group by, order by, update 

*Bài tập
Viết một chương trình Java để kết nối với cơ sở dữ liệu MySQL và thực hiện các yêu cầu quản lý học sinh sau:

Tạo hai bảng "Students" và "Classes" trong cơ sở dữ liệu với các trường (columns) và dữ liệu (data) tương ứng.

1. Bảng "Students" bao gồm các trường: StudentID (INT), StudentName (VARCHAR), ClassID (INT), AverageScore (FLOAT).
Bảng "Classes" bao gồm các trường: ClassID (INT), ClassName (VARCHAR).
2. Thực hiện câu lệnh JOIN để lấy thông tin về học sinh (Students) theo StudentID or StudentName bao gồm StudentID, StudentName, ClassName và AverageScore. Kết quả trả về phải được hiển thị trên màn hình.
3. Thực hiện câu lệnh GROUP BY để đếm số lượng học sinh theo từng lớp (ClassName). Kết quả trả về phải được hiển thị trên màn hình, sắp xếp theo số lượng học sinh giảm dần.
4. Thực hiện câu lệnh ORDER BY để lấy thông tin về học sinh (Students) theo điểm trung bình (AverageScore) giảm dần. Kết quả trả về phải được hiển thị trên màn hình.
5. Thực hiện câu lệnh UPDATE để cập nhật điểm trung bình (AverageScore) của học sinh
6. Thực hiện câu lệnh DELETE để xóa học sinh bằng StudentID
7. Trả ra các sinh viên có điểm trung bình cao nhất từng lớp

https://codelearn.io/sharing/thao-tac-apache-maven-trong-java

https://laptrinhvienjava.com/quy-uoc-dat-ten-trong-lap-trinh-java/