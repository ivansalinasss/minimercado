package com.ivansalinasss.minimercado_servicio_productos.repository;

import com.ivansalinasss.minimercado_servicio_productos.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}
