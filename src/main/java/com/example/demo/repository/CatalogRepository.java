package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CatalogItem;

@Repository

public interface CatalogRepository extends JpaRepository<CatalogItem, Long> {

	List<CatalogItem> findByCategory(String category);
}
