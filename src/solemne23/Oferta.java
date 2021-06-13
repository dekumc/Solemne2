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
public class Oferta extends Producto {

//Atributos    
    int newprecio;
    
//Constructores

    public Oferta(String categoria, String codigo, String descripcion, int precio,int newprecio) {
        super(categoria, codigo, descripcion, precio);
        this.newprecio = newprecio;
    }

//Métodos

    public int getNewprecio() {
        return newprecio;
    }

    public void setNewprecio(int newprecio) {
        this.newprecio = newprecio;
    }
    
//To String

    @Override
    public String toString() {
        return super.toString() + "/" + newprecio;
    }

}
