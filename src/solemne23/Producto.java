/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne23;

/**
 *
 * @author dekum
 */
public abstract class Producto {
//Atributos
    public String categoria;
    public String codigo;
    public String descripcion;
    public int precio;
    
//Constructores

    public Producto() {
    }

    public Producto(String categoria, String codigo, String descripcion, int precio) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

//Métodos

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    

//TO String    
    @Override
    public String toString() {
    return  categoria + "/" + codigo + "/" + descripcion + "/" + precio;
    }

}

