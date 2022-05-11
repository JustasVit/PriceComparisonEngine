package lt.PriceComparisonEngine.comparer.service;

import lt.PriceComparisonEngine.comparer.dto.ProductDTO;
import lt.PriceComparisonEngine.comparer.model.Product;

import java.util.List;

public interface ScraperService {
    List<Product> scrapeProductsByName(String name);
}
