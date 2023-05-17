package com.ahmedtaoufiq.invoice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InvoiceProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceProductId;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoiceId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;

    private int quantity;
}
