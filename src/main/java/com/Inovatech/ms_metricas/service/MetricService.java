package com.Inovatech.ms_metricas.service;

import com.Inovatech.ms_metricas.dto.MetricRequest;
import com.Inovatech.ms_metricas.dto.MetricResponse;
import com.Inovatech.ms_metricas.entity.Metric;
import com.Inovatech.ms_metricas.repository.MetricRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricService {

    private final MetricRepository metricRepository;

    public MetricResponse createMetric(
            MetricRequest request) {

        Metric metric = Metric.builder()
                .logrosCompletados(request.getLogrosCompletados())
                .objetivosActivos(request.getObjetivosActivos())
                .avancePromedio(request.getAvancePromedio())
                .pendientesCriticos(request.getPendientesCriticos())
                .objetivosPlanteados(request.getObjetivosPlanteados())
                .logrosRecientes(request.getLogrosRecientes())
                .logrosMensuales(request.getLogrosMensuales())
                .objetivosMensuales(request.getObjetivosMensuales())
                .build();

        metricRepository.save(metric);

        return MetricResponse.builder()
                .id(metric.getId())
                .logrosCompletados(metric.getLogrosCompletados())
                .objetivosActivos(metric.getObjetivosActivos())
                .avancePromedio(metric.getAvancePromedio())
                .pendientesCriticos(metric.getPendientesCriticos())
                .objetivosPlanteados(metric.getObjetivosPlanteados())
                .logrosRecientes(metric.getLogrosRecientes())
                .logrosMensuales(metric.getLogrosMensuales())
                .objetivosMensuales(metric.getObjetivosMensuales())
                .build();
    }

    public List<Metric> getMetrics() {
        return metricRepository.findAll();
    }
}
