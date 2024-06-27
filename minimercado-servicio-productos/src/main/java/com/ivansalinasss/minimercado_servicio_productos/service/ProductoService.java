package com.ivansalinasss.minimercado_servicio_productos.service;

import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import com.ivansalinasss.minimercado_servicio_productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}
