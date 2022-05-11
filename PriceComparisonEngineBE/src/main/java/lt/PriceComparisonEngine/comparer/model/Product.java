package lt.PriceComparisonEngine.comparer.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Getter
    private Long id;

    @Getter
    private String name;

    @Setter
    @Getter
    @NonNull
    private String price;

    @Setter
    @Getter
    @NonNull
    private String image;

    public Product(String name, String price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }
}
