package com.lcwd.electronic.store.dtos;

import java.sql.Date;

import com.lcwd.electronic.store.entities.Category;
import com.lcwd.electronic.store.entities.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ProductDto {

    private String productId;
    private String title;
    
    private String description;
    private int price;
    private int discountedPrice;
    private int quantity;
    private Date addedDate;
    private boolean live;
    private boolean stock;
    private String productImageName;
	public Category category;
}
