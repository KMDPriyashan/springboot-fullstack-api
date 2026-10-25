package org.example.Model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String Name;
    private String description;
    private double unitPrice;
    private String imageUrl;
}
