package com.huseyinaydin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Security
 * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    private int productId;
    private String name;
    private int qty;
    private double price;
}
