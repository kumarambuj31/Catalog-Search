package com.sapient.testcase.CatalogSearch.repository;

import com.sapient.testcase.CatalogSearch.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, String> {

}
