package lt.PriceComparisonEngine.comparer.Product.Repository;

import lt.PriceComparisonEngine.comparer.Product.Entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Iterable<Product> findProductByName(String name);
}
