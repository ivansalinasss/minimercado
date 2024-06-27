package com.ivansalinasss.minimercado_servicio_productos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "unidades")
public class Unidad {

    @Id
    private String id;
    private String descripcion;
    private String abreviatura;
    private int cantidadDecimales = 2;
    private int redondeo = 3;

    public Unidad() {
    }

    public Unidad(String descripcion, String abreviatura) {
        this.descripcion = descripcion;
        this.abreviatura = abreviatura;
    }

    public Unidad(String descripcion, String abreviatura, int cantidadDecimales) {
        this.descripcion = descripcion;
        this.abreviatura = abreviatura;
        this.cantidadDecimales = cantidadDecimales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public int getCantidadDecimales() {
        return cantidadDecimales;
    }

    public void setCantidadDecimales(int cantidadDecimales) {
        this.cantidadDecimales = cantidadDecimales;
    }

    public int getRedondeo() {
        return redondeo;
    }

    public void setRedondeo(int redondeo) {
        this.redondeo = redondeo;
    }
}
