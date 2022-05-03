package lt.PriceComparisonEngine.comparer.Product.Entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
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
    private BigDecimal price;

    @Setter
    @Getter
    @NonNull
    private String base64Image;

}
