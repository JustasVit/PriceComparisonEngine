package lt.PriceComparisonEngine.comparer.Product.Service;

import lt.PriceComparisonEngine.comparer.Product.Entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getProductByName(String name);
    Product insertProduct(Product product);
    Product deleteProduct(Long id);
}
