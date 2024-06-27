package com.ivansalinasss.minimercado_servicio_productos.controller;

import com.ivansalinasss.minimercado_servicio_productos.dto.ProductoDTO;
import com.ivansalinasss.minimercado_servicio_productos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("productos")
public class ProductoController {

    @Autowired
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/listar")
    public List<ProductoDTO> listarProductos() {
        return productoService.obtenerTodosLosProductos();
    }
}
