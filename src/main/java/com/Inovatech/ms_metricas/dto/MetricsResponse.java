package com.Inovatech.ms_metricas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MetricsResponse {

    private Long id;

    private Integer logrosCompletados;

    private Integer objetivosActivos;

    private Integer avancePromedio;

    private Integer pendientesCriticos;

    private List<String> objetivosPlanteados;

    private List<String> logrosRecientes;
}
