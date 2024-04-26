package com.lcwd.electronic.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Categories")
public class Category {
	
	 @Id
	    @Column(name = "id")
	    private String categoryId;

	    @Column(name = "category_title", length = 60, nullable = false)
	    private String title;

	    @Column(name = "category_desc", length = 500)
	    private String description;

	    private String coverImage;
	    // other attributes if you have...
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name = "category_id")
	    private  Category category;
}
