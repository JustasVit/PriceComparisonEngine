package lt.PriceComparisonEngine.comparer.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    @Getter
    @Setter
    private String name;

    @Setter
    @Getter
    @NonNull
    private String price;

    @Setter
    @Getter
    @NonNull
    private String image;
}
