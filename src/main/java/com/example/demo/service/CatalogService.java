package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.CatalogRepository;
import com.example.demo.model.CatalogItem;

@Service
public class CatalogService {
	
	@Autowired
	private CatalogRepository repository;
	
	public List<CatalogItem> getAllItems(){
		return repository.findAll();
	}
	
	public CatalogItem getItemById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	
	public CatalogItem addItem(CatalogItem item) {
		return repository.save(item);
	}
	
	public CatalogItem updateItem(Long id, CatalogItem item) {
		item.setId(id);
		return repository.save(item);
	}
	
	public void deleteItem(Long id) {
		repository.deleteById(id);
	}
	
	public List<CatalogItem> getItemByCategory(String category){
		return repository.findByCategory(category);
	}

}
