package com.ahmedtaoufiq.invoice.entities;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    private LocalDate billingDate;
    private LocalDate dueDate; // = billingDate + 1 month;
    private paymentMethod paymentMethod;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="client_id")
    private Client client;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceId")
    private List<InvoiceProduct> invoiceProducts;
}
