package org.sid.inventoryservicea;

import org.sid.inventoryservicea.entities.Product;
import org.sid.inventoryservicea.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Computer")
                    .quantity(12)
                    .price(4300).build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("smartphone")
                    .quantity(11)
                    .price(15000).build());
            productRepository.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Printer")
                    .quantity(3)
                    .price(1200).build());
        };
    }
}
