package com.marketplace.marketplace.models;

import com.marketplace.marketplace.models.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productTitle;

    private String productDescription;

    private Double price;

    private Category category;

//    @Lob // Use @Lob annotation for large objects like images
//    @Basic(fetch = FetchType.LAZY) // Fetch the image lazily to improve performance
//    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "user_entity_id")
    private UserEntity seller;

    public static Product getProductMock() {
        return builder()
                .productDescription("Predobar auto je ovo")
                .productTitle("Audi A4")
                .category(Category.CARS)
                .price(45.56)
                .build();
    }
    public static Product getProductMock1() {
        return builder()
                .productDescription("Predobar auto je ovo")
                .productTitle("BMW A4")
                .category(Category.CARS)
                .price(45.56)
                .build();
    }
    public static Product getProductMock2() {
        return builder()
                .productDescription("Predobar auto je ovo")
                .productTitle("Pentium 4")
                .category(Category.COMPUTERS)
                .price(45.56)
                .build();
    }
}
