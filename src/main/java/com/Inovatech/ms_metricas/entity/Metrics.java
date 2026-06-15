package com.Inovatech.ms_metricas.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "metrics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Metrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer logrosCompletados;

    private Integer objetivosActivos;

    private Integer avancePromedio;

    private Integer pendientesCriticos;

    @ElementCollection
    private List<String> objetivosPlanteados;

    @ElementCollection
    private List<String> logrosRecientes;
}
