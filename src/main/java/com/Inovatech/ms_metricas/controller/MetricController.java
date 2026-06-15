package com.Inovatech.ms_metricas.controller;

import com.Inovatech.ms_metricas.dto.MetricRequest;
import com.Inovatech.ms_metricas.dto.MetricResponse;
import com.Inovatech.ms_metricas.entity.Metric;
import com.Inovatech.ms_metricas.service.MetricService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metrics")
@RequiredArgsConstructor
public class MetricController {

    private final MetricService metricService;

    @PostMapping
    public MetricResponse createMetric(
            @RequestBody MetricRequest request) {

        return metricService.createMetric(request);
    }

    @GetMapping
    public List<Metric> getMetrics() {
        return metricService.getMetrics();
    }
}
