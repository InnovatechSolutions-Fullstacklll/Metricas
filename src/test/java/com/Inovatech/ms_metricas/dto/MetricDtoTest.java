package com.Inovatech.ms_metricas.dto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MetricDtoTest {

    @Test
    void metricRequestTest() {

        MetricRequest request = MetricRequest.builder()
                .logrosCompletados(20)
                .objetivosActivos(10)
                .avancePromedio(80)
                .pendientesCriticos(1)
                .objetivosPlanteados(List.of("A"))
                .logrosRecientes(List.of("B"))
                .logrosMensuales(List.of(1))
                .objetivosMensuales(List.of(2))
                .build();

        assertEquals(20, request.getLogrosCompletados());
    }

    @Test
    void metricResponseTest() {

        MetricResponse response = MetricResponse.builder()
                .id(1L)
                .logrosCompletados(50)
                .build();

        assertEquals(1L, response.getId());
        assertEquals(50, response.getLogrosCompletados());
    }
}