package com.Inovatech.ms_metricas.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecurityConfigTest {

    @Test
    void securityConfigExists() {

        SecurityConfig config =
                new SecurityConfig();

        assertNotNull(config);
    }
}