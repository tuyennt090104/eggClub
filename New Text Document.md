Người thuyết trình: Lễ, Huy
Công việc tuần sau:

Câu hỏi: 
- Khái niệm tính kế thừa trong OOP, phạm vi kế thừa, cách thức kế thừa 1 class trong java với từ khóa extend, super
- Thế nào là Override (ghi đè), Overload (nạp chồng). Phân biệt, tìm hiểu phương thức main có thể nạp chồng được không?
- Tìm hiểu về ghi đè equal và hashcode, tại sao khi ghi đè equal lại phải ghi đè thêm hashcode
- Java giải quyết vấn đề đa kế thừa như nào? Tìm hiểu sự khác nhau giữa abstract class vs interface
- Upcasting và downcasting, Chuyển đổi (cast) giá trị của từng kiểu dữ liệu
- Các lớp Wrapper ( Interger, Double, Long, Float,...), Wrapper class dùng để làm gì?

Bài tập 1: Xây dựng lớp đối tượng "Hình tam giác" (Triangle) kế thừa từ lớp "Hình học" (Shape), với thuộc tính độ dài 3 cạnh, phương thức tính diện tích và chu vi.

Bài tập 2: Thư viện BKLib quản lý danh sách các loại sách:

+ Sách giáo khoa: Mã sách, tiêu đề, ngày nhập (ngày, tháng, năm), đơn giá, số lượng, nhà xuất bản, tình trạng (mới, cũ). 
◼ Nếu tình trạng sách là mới thì: thành tiền = số lượng * đơn giá. 
◼ Nếu tình trạng sách là cũ thì: thành tiền = số lượng * đơn giá * 50% 

+ Sách tham khảo: Mã sách, tiêu đề, ngày nhập (ngày, tháng, năm), đơn giá, số lượng, nhà xuất bản, chuyên ngành, thuế. 
◼ Thành tiền = số lượng * đơn giá +thuế

+ Sách ngoại văn: Mã sách, tiêu đề, ngày nhập (ngày, tháng, năm), đơn giá, số lượng, nhà xuất bản, ngôn ngữ.
◼ Thành tiền = số lượng * đơn giá * 120%

Thực hiện các yêu cầu sau: 
◼ Xây dựng các lớp với chức năng thừa kế. 

Tạo 1 chương trình console để:
◼ Nhập xuất danh sách các loại sách. 
◼ Tính tổng thành tiền cho từng loại. 
◼ Xuất ra các sách giáo khoa của nhà xuất bản X.