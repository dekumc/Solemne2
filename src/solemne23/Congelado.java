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
public class Congelado extends Producto {
//Atributos    
    String carne;
    
//Constructores

    public Congelado(String categoria, String codigo, String descripcion, int precio,String carne) {
        super(categoria, codigo, descripcion, precio);
        this.carne = carne;
    }

//Métodos
    
    public String getCarne() {
        return carne;
    }  

    public void setCarne(String carne) {
        this.carne = carne;
    }

//To String

    @Override
    public String toString() {
        return super.toString() + "/" + carne;
    }
  
}
