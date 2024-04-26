package com.lcwd.electronic.store.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data 

@Entity 
	@Table(name = "products")
	public class Product {


	    @Id
	    private String productId;
	    private String title;
	    @Column(length = 10000)
	    private String description;
	    private int price;
	    private int discountedPrice;
	    private int quantity;
	    private Date addedDate;
	    private boolean live;
	    private boolean stock;
	    private String productImageName;
		public Category category;
		@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Product> products = new ArrayList<>();
	
	   


	}


