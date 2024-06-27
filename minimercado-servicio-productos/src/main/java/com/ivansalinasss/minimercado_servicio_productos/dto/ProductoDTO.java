package com.ivansalinasss.minimercado_servicio_productos.dto;

public class ProductoDTO {

    private String nombre;
    private double cantidad;
    private String unidadAbreviatura;
    private double precioUnitario;

    public ProductoDTO(String nombre, double cantidad, String unidadAbreviatura, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadAbreviatura = unidadAbreviatura;
        this.precioUnitario = precio;
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

    public String getUnidadAbreviatura() {
        return unidadAbreviatura;
    }

    public void setUnidadAbreviatura(String unidadAbreviatura) {
        this.unidadAbreviatura = unidadAbreviatura;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
