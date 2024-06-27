package com.ivansalinasss.minimercado_servicio_productos;

import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import com.ivansalinasss.minimercado_servicio_productos.model.Unidad;
import com.ivansalinasss.minimercado_servicio_productos.repository.ProductoRepository;
import com.ivansalinasss.minimercado_servicio_productos.repository.UnidadRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MinimercadoServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimercadoServicioProductosApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductoRepository repository) {
		return args -> {
			Unidad unidad = new Unidad("Item", "item");
			Producto producto = new Producto("Alfajor", 5, unidad, 5000);

			repository.insert(producto);
		};
	}
}
