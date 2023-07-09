- Khái niệm về cơ sở dữ liệu: Phân loại cơ sở dữ liệu: SQL, NoSQL. Mục đích sử dụng của CSDL 
- Tìm hiểu 1 trình quản lý SQL bất kỳ: mysql, postgresql, sqlserver,... 
- Tìm hiểu các cú pháp cơ bản của SQL: CREATE TABLE, INSERT INTO , SELECT, FROM, DELETE, UPDATE
- Kết nối java với sql: jdbc 

Bài tập: Quản lý thông tin sinh viên
1.Xây dựng một lớp Student (Sinh viên) với các thuộc tính sau:
id (int): mã số sinh viên
name (String): họ và tên sinh viên
age (int): tuổi của sinh viên
major (String): chuyên ngành

2. Tạo một cơ sở dữ liệu MySQL có tên "student_management" và một bảng "students" để lưu trữ thông tin sinh viên. Bảng "students" có cấu trúc như sau:
id (INT): khóa chính, mã số sinh viên
name (VARCHAR): họ và tên sinh viên
age (INT): tuổi của sinh viên
major (VARCHAR): chuyên ngành

3. Viết chương trình Java để thực hiện các thao tác sau:
Thêm sinh viên mới vào cơ sở dữ liệu.
Hiển thị danh sách sinh viên trong cơ sở dữ liệu.
Cập nhật thông tin của sinh viên.
Xóa sinh viên khỏi cơ sở dữ liệu.