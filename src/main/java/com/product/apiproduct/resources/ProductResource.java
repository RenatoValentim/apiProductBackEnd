package com.product.apiproduct.resources;

import java.util.List;

import com.product.apiproduct.models.Product;
import com.product.apiproduct.repository.ProductRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ProductResource {

  private ProductRepository repository;

  ProductResource(ProductRepository productRepository) {
    this.repository = productRepository;
  }

  @GetMapping(path = "/produtos")
  public List<Product> listProducts() {
    return repository.findAll();
  }

  @GetMapping(path = "/produto/{id}")
  public ResponseEntity<Product> listProduct(@PathVariable long id) {
    return repository.findById(id)
      .map(record -> ResponseEntity.ok().body(record))
      .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping(path = "/produto")
  public Product saveProduct(@RequestBody Product product) {
    return repository.save(product);
  }

  @PutMapping(path = "/produto/{id}")
  public ResponseEntity<Product> update(@PathVariable("id") long id, @RequestBody Product product) {
    return repository.findById(id)
      .map(record -> {
        record.setName(product.getName());
        record.setQuantity(product.getQuantity());
        record.setValue(product.getValue());
        Product updated = repository.save(record);
        return ResponseEntity.ok().body(updated);
      }).orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping(path = "/produto/{id}")
  public ResponseEntity<?> delete(@PathVariable("id") long id) {
    return repository.findById(id)
      .map(record -> {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
      }).orElse(ResponseEntity.notFound().build());
  }

}