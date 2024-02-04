package org.sid.inventoryservicea.repository;

import org.sid.inventoryservicea.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
