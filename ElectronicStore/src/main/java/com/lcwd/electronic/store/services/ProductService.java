package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.ProductDto;

public interface ProductService {
	
	ProductDto create(ProductDto productDto);
	
	ProductDto update(ProductDto productDto, String producrId);
	
	void delete(String productId);
	
	 ProductDto get(String productId);

	    //get all
	    PageableResponse<ProductDto> getAll(int pageNumber, int pageSize, String sortBy, String sortDir);

	    //get all : live
	    PageableResponse<ProductDto> getAllLive(int pageNumber, int pageSize, String sortBy, String sortDir);

	    //search product
	    PageableResponse<ProductDto> searchByTitle(String subTitle, int pageNumber, int pageSize, String sortBy, String sortDir);


	    //create product with category
	    ProductDto createWithCategory(ProductDto productDto,String categoryId);


	    //update category of product
	    ProductDto updateCategory(String productId,String categoryId);

	    PageableResponse<ProductDto> getAllOfCategory(String categoryId,int pageNumber,int pageSize,String sortBy, String sortDir);
}
