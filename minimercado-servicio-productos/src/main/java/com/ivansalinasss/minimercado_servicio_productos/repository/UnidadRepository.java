package com.ivansalinasss.minimercado_servicio_productos.repository;

import com.ivansalinasss.minimercado_servicio_productos.model.Unidad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UnidadRepository extends MongoRepository<Unidad, String> {
}
