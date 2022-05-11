package lt.PriceComparisonEngine.comparer.repository;

import lt.PriceComparisonEngine.comparer.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Iterable<Product> findProductByName(String name);
}
