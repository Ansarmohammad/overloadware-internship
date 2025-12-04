package com.overloadware.task4.service;
import com.overloadware.task4.model.Product;
import com.overloadware.task4.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    private final ProductRepository repo;
    public ProductService(ProductRepository repo) { this.repo = repo; }
    public List<Product> findAll() { return repo.findAll(); }
    public Optional<Product> findById(Long id) { return repo.findById(id); }
    public Product create(Product p) { p.setId(null); return repo.save(p); }
    public Optional<Product> update(Long id, Product p) {
        return repo.findById(id).map(existing -> {
            existing.setName(p.getName());
            existing.setDescription(p.getDescription());
            existing.setPrice(p.getPrice());
            return repo.save(existing);
        });
    }
    public boolean delete(Long id) {
        return repo.findById(id).map(existing -> { repo.delete(existing); return true; }).orElse(false);
    }
}
