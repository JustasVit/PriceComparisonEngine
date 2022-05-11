package lt.PriceComparisonEngine.comparer.service;

import lt.PriceComparisonEngine.comparer.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getProductByName(String name);
    Product insertProduct(Product product);
    Product deleteProduct(Long id);
}
