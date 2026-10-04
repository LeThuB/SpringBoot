package SS1.bai345;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService(){
        products.add(new Product(1,"May tinh",5000));
        products.add(new Product(2,"Dien thoai",2000));
        products.add(new Product(3,"Ban phim ",500));
    }
//lay tat ca danh sach
    public List<Product> getAllProducts() {
        return products;
    }

    // them moi
    public Product addProduct(Product product){
        products.add(product);
        return product;
    }

    //cap nhat
    public Product updateProduct(int id, Product newInfo) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(newInfo.getName());
                p.setPrice(newInfo.getPrice());
                return p;
            }
        }
        return null;
    }

    //xoa
    public boolean deleteProduct(int id) {
        // removeIf trả về true nếu xóa được phần tử
        return products.removeIf(p -> p.getId() == id);
    }
}
