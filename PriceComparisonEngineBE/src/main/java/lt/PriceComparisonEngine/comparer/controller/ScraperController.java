package lt.PriceComparisonEngine.comparer.controller;

import lt.PriceComparisonEngine.comparer.dto.ProductDTO;
import lt.PriceComparisonEngine.comparer.model.Product;
import lt.PriceComparisonEngine.comparer.service.ScraperService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/products")
public class ScraperController {

    private final ScraperService scraperService;
    private final ModelMapper modelMapper;

    public ScraperController(ScraperService scraperService, ModelMapper modelMapper) {
        this.scraperService = scraperService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<ProductDTO>> getAllProducts(@RequestParam String productName) {
        return new ResponseEntity<>(scraperService.scrapeProductsByName(productName)
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList()),
                HttpStatus.OK);
    }

    private ProductDTO convertToDto(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }
    private Product convertToEntity(ProductDTO productDTO) {
        return modelMapper.map(productDTO, Product.class);
    }
}
