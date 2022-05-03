package lt.PriceComparisonEngine.comparer.Product.DTO;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    @Getter
    private String name;

    @Setter
    @Getter
    @NonNull
    private BigDecimal price;

    @Setter
    @Getter
    @NonNull
    private String base64Image;
}
