package com.Inovatech.ms_metricas.entity;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MetricTest {

    @Test
    void metricEntityTest() {

        Metric metric = Metric.builder()
                .id(1L)
                .logrosCompletados(10)
                .objetivosActivos(5)
                .avancePromedio(75)
                .pendientesCriticos(1)
                .objetivosPlanteados(List.of("Objetivo"))
                .logrosRecientes(List.of("Logro"))
                .build();

        assertEquals(1L, metric.getId());
        assertEquals(10, metric.getLogrosCompletados());
        assertEquals(75, metric.getAvancePromedio());
    }
}