package com.Inovatech.ms_metricas.service;

import com.Inovatech.ms_metricas.dto.MetricRequest;
import com.Inovatech.ms_metricas.dto.MetricResponse;
import com.Inovatech.ms_metricas.entity.Metric;
import com.Inovatech.ms_metricas.repository.MetricRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.ArgumentMatchers;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MetricServiceTest {

    @Mock
    private MetricRepository repository;

    @InjectMocks
    private MetricService service;

    @Test
    void createMetricTest() {

        MetricRequest request = MetricRequest.builder()
                .logrosCompletados(10)
                .objetivosActivos(5)
                .avancePromedio(70)
                .pendientesCriticos(2)
                .objetivosPlanteados(List.of("Objetivo 1"))
                .logrosRecientes(List.of("Logro 1"))
                .logrosMensuales(List.of(1,2,3))
                .objetivosMensuales(List.of(4,5,6))
                .build();

        Metric metric = Metric.builder()
                .id(1L)
                .logrosCompletados(10)
                .objetivosActivos(5)
                .avancePromedio(70)
                .pendientesCriticos(2)
                .objetivosPlanteados(List.of("Objetivo 1"))
                .logrosRecientes(List.of("Logro 1"))
                .logrosMensuales(List.of(1,2,3))
                .objetivosMensuales(List.of(4,5,6))
                .build();

        when(repository.save(ArgumentMatchers.any(Metric.class)))
                .thenReturn(metric);

        MetricResponse response = service.createMetric(request);

        assertEquals(10, response.getLogrosCompletados());
        assertEquals(5, response.getObjetivosActivos());

        verify(repository).save(any(Metric.class));
    }

    @Test
    void getMetricsTest() {

        when(repository.findAll())
                .thenReturn(List.of(
                        Metric.builder()
                                .id(1L)
                                .build()
                ));

        List<Metric> metrics = service.getMetrics();

        assertEquals(1, metrics.size());

        verify(repository).findAll();
    }
}