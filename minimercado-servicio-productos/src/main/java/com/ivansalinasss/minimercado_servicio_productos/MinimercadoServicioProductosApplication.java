package com.ivansalinasss.minimercado_servicio_productos;

import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import com.ivansalinasss.minimercado_servicio_productos.model.Unidad;
import com.ivansalinasss.minimercado_servicio_productos.repository.ProductoRepository;
import com.ivansalinasss.minimercado_servicio_productos.repository.UnidadRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MinimercadoServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimercadoServicioProductosApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*");
			}
		};
	}
}
