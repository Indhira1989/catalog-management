package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CatalogService;
import com.example.demo.model.CatalogItem;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {
	
	@Autowired
	private CatalogService service;
	
	@GetMapping("/items")
	public List<CatalogItem> getAllItems(){
		
		return service.getAllItems();
	}
	
	@GetMapping("/item/{id}")
	public CatalogItem getItemById(@PathVariable Long id) {
		return service.getItemById(id);
	}
	
	@PostMapping("/items")
	public CatalogItem addItem(@RequestBody CatalogItem item) {
		return service.addItem(item);
	}
	
	@PutMapping("/items/{id}")
	public CatalogItem updateItem(@PathVariable Long id, @RequestBody CatalogItem item) {
		return service.updateItem(id, item);
	}
	
	@DeleteMapping("/items/{id}")
	public void deleteItem(@PathVariable Long id) {
		service.deleteItem(id);
	}
	@GetMapping("/items/{category}")
	public List<CatalogItem> getItemByCategory(@PathVariable String category) {
		return service.getItemByCategory(category);
	}
	
	
	
	

}
