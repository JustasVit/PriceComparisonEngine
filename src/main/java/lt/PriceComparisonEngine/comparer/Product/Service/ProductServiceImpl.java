package lt.PriceComparisonEngine.comparer.Product.Service;

import lt.PriceComparisonEngine.comparer.Product.Entity.Product;
import lt.PriceComparisonEngine.comparer.Product.Repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> getProductByName(String name){
        return (List<Product>) productRepository.findProductByName(name);
    }

    public Product insertProduct(Product product){
        return productRepository.save(product);
    }

    public Product deleteProduct(Long id){
        Product product = productRepository.findById(id).orElseThrow();
        productRepository.deleteById(product.getId());
        return product;
    }




}
