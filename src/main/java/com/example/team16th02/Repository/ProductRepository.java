package com.example.team16th02.Repository;

import com.example.team16th02.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
    @Query("select case when count(c)> 0 then true else false end " +
            "from Product c where lower(c.code) like lower(:code)")
    boolean checkCodeExist(@Param("code") String code);

    boolean existsByCode(String code);
}
