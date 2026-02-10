package com.example.solid.isp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WorkerTest {

    @Test
    void developerShouldOnlyWork() {
        Workable developer = new Developer();

        assertDoesNotThrow(developer::work);
    }

    @Test
    void officeWorkerShouldWorkAndEat() {
        OfficeWorker worker = new OfficeWorker();

        assertDoesNotThrow(worker::work);
        assertDoesNotThrow(worker::eat);
    }
}
