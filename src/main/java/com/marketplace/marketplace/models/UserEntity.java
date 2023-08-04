package com.marketplace.marketplace.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> sellingItems = new ArrayList<>();

    public static UserEntity userMock() {
        List<Product> listProd = new ArrayList<>();
        listProd.add(Product.getProductMock());
        listProd.add(Product.getProductMock1());
        listProd.add(Product.getProductMock2());
        return builder()
                .firstName("Muhedin")
                .lastName("Alic")
                .email("test@email.com")
                .password("kokoska123")
                .dateOfBirth(LocalDate.now())
                .sellingItems(listProd)
                .build();
    }
}
