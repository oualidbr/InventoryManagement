package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id ;
	 private double quantity;
	 @ManyToOne
	 private PurchaseOrder purchaseOrder;
	 @ManyToOne
	 private Item item;

}
