package lt.PriceComparisonEngine.comparer.service;

import lt.PriceComparisonEngine.comparer.model.Product;
import lt.PriceComparisonEngine.comparer.repository.ProductRepository;
import lt.PriceComparisonEngine.comparer.service.ProductService;

import java.util.List;

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
