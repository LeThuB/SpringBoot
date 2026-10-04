package SS1.bai1;

import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.*;

public class bai1 {
}
//quy trinh mô ta cho chức năng xem danh sach san pham

// 1. Client gửi Request

//GET http://localhost:8080/products
//→ Mục đích: yêu cầu Backend lấy danh sách sản phẩm.

// 2. Controller nhận Request
//@GetMapping("/products")
//→ Spring Boot nhận GET /products và gọi method tương ứng.

// 3. Service xử lý
//Controller → Service
//→ Service chứa logic xử lý của chức năng.

// 4. Repository lấy dữ liệu
//Service → Repository → MySQL
//→ Repository truy vấn database để lấy danh sách sản phẩm.

// 5. Response trả về Client duoi dạng JSON