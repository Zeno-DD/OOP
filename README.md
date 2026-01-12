ĐỀ SỐ 1-1
Một công ty gồm có các cán bộ là nhân viên, quản lý.

Mỗi cán bộ cần quản lý các thuộc tính: Họ tên, năm sinh, giới tính, địa chỉ, hệ số lương, LUONG_CO_BAN = 2.000.000.

Lớp nhân viên có thêm thuộc tính: Ngành đào tạo.

Lương = Hệ số lương * lương cơ bản.

Lớp quản lý có thêm thuộc tính: Hệ số chức vụ (<1).

Lương = Hệ số lương * lương cơ bản * (1 + hệ số chức vụ).

a) Xây dựng các lớp NhanVien, QuanLy kế thừa từ lớp CanBo (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính lương, in thông tin cho từng lớp. (2 điểm)

c) Xây dựng giao diện cho phép thêm mới NhanVien, QuanLy, khi ấn “Lưu” sẽ khởi tạo đối tượng lưu vào trong chương trình (2 điểm)

d) Hiển thị danh sách các cán bộ đã nhập trên giao diện bảng, hiển thị ở cửa sổ console được nửa số điểm (2 điểm)

e) Trên giao diện khi ấn “Lưu File” sẽ lưu thông tin CanBo đã nhập vào file canbo.txt (2 điểm)

ĐỀ SỐ 1-2
Cửa hàng KFC gồm có các nhân viên là nhân viên bếp, nhân viên thu ngân.

Mỗi nhân viên cần quản lý các thuộc tính: Họ tên, thâm niên, quê quán, số giờ làm việc, LUONG_GIO = 100.000.

Lớp nhân viên bếp có thêm thuộc tính: isBepTruong (boolean), thưởng chức vụ.

Lương = Số giờ làm việc * lương mỗi giờ + thưởng chức vụ (nếu là bếp trưởng).

Lớp nhân viên thu ngân có thêm thuộc tính: isBietNgoaiNgu (boolean)

Lương = Số giờ làm việc * lương mỗi giờ

a) Xây dựng các lớp NhanVienBep, NhanVienThuNgan kế thừa từ lớp NhanVien (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính lương, in thông tin cho từng lớp. (2 điểm)

c) Xây dựng giao diện cho phép thêm mới NhanVienBep, NhanVienThuNgan, khi ấn “Lưu” sẽ khởi tạo đối tượng lưu vào trong chương trình (2 điểm)

d) Hiển thị danh sách các nhân viên đã nhập trên giao diện bảng, hiển thị ở cửa sổ console được nửa số điểm (2 điểm)

e) Trên giao diện khi ấn “Lưu File” sẽ lưu thông tin nhân viên đã nhập vào file nhanvien.txt (2 điểm)

ĐỀ SỐ 2-1
Một cửa hàng gồm có các loại hàng hóa là điện thoại, máy tính bảng, phụ kiện.

Mỗi hàng hóa cần quản lý các thuộc tính: Tên hàng, mã hàng, giá nhập, giá bán, THUONG_BAN_HANG = 0.2

Điện thoại có thêm thuộc tính: Giá sim ghép.

Lợi nhuận = (giá bán – giá nhập) * (1- thưởng bán hàng) – giá sim ghép.

Máy tính bảng có thêm thuộc tính: Kích thước màn hình.

Lợi nhuận = (giá bán – giá nhập) * (1- thưởng bán hàng)

a) Xây dựng các lớp DienThoai, MayTinhBang kế thừa từ lớp HangHoa (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính lợi nhuận, in thông tin cho từng lớp (2 điểm)

c) Đọc dữ liệu hàng hóa từ file hanghoa.txt (sinh viên tự định nghĩa cấu trúc file hanghoa.txt) (2 điểm)

d) Xây dựng giao diện cho phép tìm kiếm thông tin hàng hóa theo mã hàng (2 điểm)

e) Trên giao diện ấn nút “Sắp xếp” sẽ sắp xếp danh sách mặt hàng bán được theo thứ tự giảm dần lợi nhuận có thể thu được và hiển thị trên console hoặc giao diện cửa sổ (2 điểm)

ĐỀ SỐ 2-2
Một nhà hàng phục vụ gồm các mặt hàng là món ăn và đồ uống.

Mỗi mặt hàng cần quản lý các thuộc tính: tên mặt hàng, mã hàng, số lượng, giá vốn, TY_LE_GIA_VON = 0.4

Món ăn có thêm thuộc tính là: cần trình diễn (boolean)

Giá trên menu = (giá vốn)/Tỷ lệ giá vốn + 200.000 (nếu cần trình diễn).

Đồ uống có thêm thuộc tính là: có nóng không (boolean).

Giá trên menu = (giá vốn)/Tỷ lệ giá vốn

a) Xây dựng lớp MonAn, DoUong kế thừa từ lớp MatHang (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính giá trên menu, in thông tin cho từng lớp (2 điểm)

c) Đọc dữ liệu mặt hàng từ file mathang.txt (sinh viên tự định nghĩa cấu trúc file mathang.txt) (2 điểm)

d) Xây dựng giao diện cho phép tìm kiếm thông tin mặt hàng theo mã hàng (2 điểm)

e) Trên giao diện ấn nút “Sắp xếp” sẽ sắp xếp danh sách mặt hàng theo thứ tự giảm dần giá trên menu và hiển thị trên console hoặc giao diện cửa sổ (2 điểm)

ĐỀ SỐ 3-2
Hợp tác xã phát ruộng cho người dân gồm ruộng có hình chữ nhật và hình vuông

Mỗi ruộng sẽ có các thông tin bao gồm mã ruộng, tên chủ hộ, loại cây trồng, DIEN_TICH_MAX=100.
Ruộng hình vuông có thêm thuộc tính: độ dài cạnh
Ruộng hình chữ nhật có thêm thuộc tính: chiều dài, chiều rộng
a) Xây dựng các lớp Ruộng vuông, RuongChuNhat kế thừa từ lớp Ruong (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức tính diện tích, in thông tin cho từng lớp (2 điểm)

c) Xây dựng giao diện cho phép thêm một RuongVuong, RuongChuNhat, khi ấn “Lưu” sẽ lưu thông tin các mảnh ruộng vào cùng 1 List (2 điểm)

d) Xây dựng giao diện thống kê số ruộng từng loại (vuông, chữ nhật); loại cây trồng được chọn trồng nhiều nhất, số ruộng có diện tích lớn hơn diện tích tối đa (2 điểm)

e) Trên giao diện khi ấn “Lưu File” sẽ lưu thông tin danh sách ruộng đã nhập vào file ruong.txt (2 điểm)


ĐỀ SỐ 4-1
Một hãng hàng không cần quản lý các loại vé máy bay bao gồm: Vé hạng thương gia và Vé hạng phổ thông. Mỗi vé cần quản lý các thuộc tính: Mã vé, Họ tên khách hàng, Giá vé cơ bản, PHI_SAN_BAY = 250.000.

Lớp Vé hạng thương gia có thêm thuộc tính: Dịch vụ phòng chờ (boolean), Hệ số sang trọng (thường là 2.0).

Giá bán = Giá vé cơ bản * Hệ số sang trọng + Phí sân bay + 500.000 (nếu có sử dụng Dịch vụ phòng chờ).

Lớp Vé hạng phổ thông có thêm thuộc tính: Khối lượng hành lý ký gửi (kg).

Giá bán = Giá vé cơ bản + Phí sân bay + (Khối lượng hành lý * 50.000).

Yêu cầu:

a) Xây dựng các lớp VeThuongGia, VePhoThong kế thừa từ lớp VeMayBay (2 điểm).

b) Xây dựng các phương thức khởi tạo (constructor), các phương thức getter/setter, phương thức tính giá bán, và phương thức toString để in thông tin chi tiết cho từng lớp (2 điểm).

c) Xây dựng giao diện (GUI) cho phép nhập thông tin cho VeThuongGia hoặc VePhoThong. Khi ấn nút “Thêm” sẽ khởi tạo đối tượng tương ứng và lưu vào một danh sách (List) trong chương trình (2 điểm).

d) Xây dựng chức năng hiển thị: Khi người dùng ấn nút "Hiển thị", danh sách các vé đã nhập sẽ được hiển thị lên bảng (JTable) trên giao diện hoặc in ra cửa sổ Console (2 điểm).

e) Trên giao diện có nút “Lưu File”. Khi ấn nút này, chương trình sẽ lưu toàn bộ thông tin các vé trong danh sách vào file vemaybay.txt (sinh viên tự định nghĩa cấu trúc file, ví dụ: lưu dạng text hoặc object serialization) (2 điểm).


ĐỀ SỐ 4-2

Cửa hàng vàng bạc lưu các thông tin mặt hàng trao đổi gồm tiền tệ và trang sức. Một mặt hàng gồm các thông tin: mã hàng, tên hàng, có được phép mua bán không (boolean)

Lớp tiền tệ có thêm thuộc tính: tỷ giá chuyển đổi.

Lớp trang sức có thêm thuộc tính: giá theo cân.

a) Xây dựng các lớp TienTe, TrangSuc kế thừa từ lớp MatHang (lớp MatHang là lớp trừu tượng với phương thức trừu tượng là in thông tin mặt hàng) (2 điểm)

b) Xây dựng các phương thức khởi tạo, các phương thức getter/setter, phương thức in thông tin mặt hàng (2 điểm)

c) Đọc dữ liệu mặt hàng từ file mathang.txt (sinh viên tự định nghĩa cấu trúc file mathang.txt) (2 điểm)

d) Xây dựng giao diện cho phép tra thông tin mặt hàng theo mã hàng (2 điểm)

e) Trong trường hợp mặt hàng không tồn tại, hiển thị giao diện thêm mới mặt hàng và lưu vào file mathang.txt (2 điểm)
