package com.example.solid.srp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InvoiceTest {

    @Test
    void shouldCalculateTotalWithTax() {
        Invoice invoice = new Invoice("Santiago", 100);

        double total = invoice.calculateTotal();

        assertEquals(121.0, total);
    }

    @Test
    void shouldStoreCustomerAndAmount() {
        Invoice invoice = new Invoice("Santiago", 200);

        assertEquals("Santiago", invoice.getCustomer());
        assertEquals(200, invoice.getAmount());
    }
}
