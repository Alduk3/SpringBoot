package com.riwi._01_librosya.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "LibrosYa API", version = "1.0", description = "Documentación api de un sistema de gestión de biblioteca en línea que permite almacenar y gestionar eficientemente los libros, usuarios, préstamos y reservas."))

public class OpenApiConfig {
}
