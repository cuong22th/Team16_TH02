package com.example.team16th02.Service;

import com.example.team16th02.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductService {
    Object getById(String code);

    Object findAll();

    boolean checkCodeExist(String code);

    void save(Product product);

    void deleteById(String code);
}
