package com.ivansalinasss.minimercado_servicio_productos;

public class Unidad {

    private String descripcion;
    private String abreviatura;
    private int cantidadDecimales = 2;
    private int redondeo = 3;

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
