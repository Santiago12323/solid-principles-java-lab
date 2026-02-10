package com.example.solid.dip;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OrderProcessorTest {

    @Test
    void shouldProcessOrderUsingInjectedDatabase() {
        Database database = new MySQLDatabase();
        GoodOrderProcessor processor = new GoodOrderProcessor(database);

        assertDoesNotThrow(processor::processOrder);
    }
}
