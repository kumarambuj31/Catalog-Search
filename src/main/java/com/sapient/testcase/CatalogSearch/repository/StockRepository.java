package com.sapient.testcase.CatalogSearch.repository;

import com.sapient.testcase.CatalogSearch.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}
