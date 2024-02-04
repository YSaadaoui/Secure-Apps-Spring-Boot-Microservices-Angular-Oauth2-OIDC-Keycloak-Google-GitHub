package org.sid.inventoryservicea.web;

import lombok.AllArgsConstructor;
import org.sid.inventoryservicea.entities.Product;
import org.sid.inventoryservicea.repository.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {
    ProductRepository productRepository;

    @GetMapping("/products")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> products(){
        return productRepository.findAll();
    }
}
