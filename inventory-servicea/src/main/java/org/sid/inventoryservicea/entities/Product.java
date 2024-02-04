package org.sid.inventoryservicea.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
