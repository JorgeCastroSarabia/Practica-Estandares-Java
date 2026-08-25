package com.mycompany.model;

public class producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int existencia;

    public producto(String codigo, String nombre, double precio, int existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    public void MostrarInfo(){
        if(getPrecio() > 0 && getExistencia() >0 ){
            System.out.println("Nombre: "+getNombre());
            System.out.println("Codigo: "+getCodigo());
            System.out.println("Existencia: "+getExistencia());
            System.out.println("Precio: "+getPrecio());
        } else { System.out.println("Error en la validacion de valores"); }
    }
    
    
    
    
}
