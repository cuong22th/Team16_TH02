package com.example.team16th02.Service;

import com.example.team16th02.Model.Product;
import com.example.team16th02.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService implements IProductService{
    @Autowired
    private final ProductRepository productRepository;
    @Override
    public Object getById(String code) {
        return productRepository.getById(code);
    }

    @Override
    public Object findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean checkCodeExist(String code) {
        return productRepository.existsByCode(code);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(String code) {
        productRepository.deleteById(code);
    }
}
