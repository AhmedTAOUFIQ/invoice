package com.ahmedtaoufiq.invoice.repositories;

import com.ahmedtaoufiq.invoice.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findAllByClientId(Long id);

    List<Invoice> findAllByDueDateBefore(LocalDate date);

}
