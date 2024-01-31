package com.azure.intigration.azureintigration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.azure.intigration.azureintigration.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(value="SELECT p from Product p WHERE " 
    +" p.name LIKE CONCAT('%',:query,'%')"
    +" Or p.description LIKE CONCAT('%',:query,'%')")
    List<Product> searcProducts(String query); 

   @Query(value = "select * from products p where "
   +" p.name LIKE CONCAT('%',:query,'%')"+
   " Or p.description LIKE CONCAT('%',:query,'%')"
   ,nativeQuery=true)
    List<Product> searcProductbyNativeQuery(String query);
} 