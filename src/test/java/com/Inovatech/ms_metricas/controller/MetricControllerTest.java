package com.Inovatech.ms_metricas.controller;

import com.Inovatech.ms_metricas.dto.MetricRequest;
import com.Inovatech.ms_metricas.dto.MetricResponse;
import com.Inovatech.ms_metricas.entity.Metric;
import com.Inovatech.ms_metricas.service.MetricService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MetricControllerTest {

    @Mock
    private MetricService metricService;

    @InjectMocks
    private MetricController controller;

    @Test
    void createMetricTest() {

        MetricRequest request = new MetricRequest();

        MetricResponse response =
                MetricResponse.builder()
                        .id(1L)
                        .build();

        when(metricService.createMetric(request))
                .thenReturn(response);

        MetricResponse result =
                controller.createMetric(request);

        assertEquals(1L, result.getId());
    }

    @Test
    void getMetricsTest() {

        when(metricService.getMetrics())
                .thenReturn(List.of(
                        Metric.builder()
                                .id(1L)
                                .build()
                ));

        List<Metric> result =
                controller.getMetrics();

        assertEquals(1, result.size());
    }
}