package com.ivansalinasss.minimercado_servicio_productos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "productos")
public class Producto {

    @Id
    private String id;
    private String nombre;
    private double cantidad;
    @Field("unidad_id")
    @DocumentReference
    private Unidad unidad;
    private double precioUnitario;

    public Producto() {
    }

    public Producto(String nombre, double cantidad, Unidad unidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.precioUnitario = precioUnitario;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
