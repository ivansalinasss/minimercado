package com.ivansalinasss.minimercado_servicio_productos;

import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import com.ivansalinasss.minimercado_servicio_productos.model.Unidad;
import com.ivansalinasss.minimercado_servicio_productos.repository.ProductoRepository;
import com.ivansalinasss.minimercado_servicio_productos.repository.UnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private UnidadRepository unidadRepository;

    @Override
    public void run(String... args) throws Exception {
        // Poblar la base de datos con algunos productos
        Unidad item = new Unidad("Item", "item");
        Unidad kilos = new Unidad("Kilogramos", "kgs");

        unidadRepository.save(item);
        unidadRepository.save(kilos);

        Producto alfajor = new Producto("Alfajor", 5, item, 5000);
        Producto comida = new Producto("Comida para gatos", 8.9, kilos, 3500);
        Producto manzana = new Producto("Manzana", 35.5, kilos, 14000);

        productoRepository.save(alfajor);
        productoRepository.save(comida);
        productoRepository.save(manzana);
    }

}
