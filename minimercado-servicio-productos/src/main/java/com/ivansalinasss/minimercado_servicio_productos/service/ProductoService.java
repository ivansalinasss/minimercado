package com.ivansalinasss.minimercado_servicio_productos.service;

import com.ivansalinasss.minimercado_servicio_productos.dto.ProductoDTO;
import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import com.ivansalinasss.minimercado_servicio_productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<ProductoDTO> obtenerTodosLosProductos() {

        return productoRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private ProductoDTO convertToDto(Producto producto) {
        return new ProductoDTO(
                producto.getNombre(),
                producto.getCantidad(),
                producto.getUnidad().getAbreviatura(), // Solo la abreviatura
                producto.getPrecioUnitario()
        );
    }
}
