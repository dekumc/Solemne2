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
public class Liquido extends Producto {
    
//Atributos    
    int tamanoml;
    
//Constructores

    public Liquido(String categoria, String codigo, String descripcion, int precio,int tamanoml) {
        super(categoria, codigo, descripcion, precio);
        this.tamanoml = tamanoml;
    }

//Métodos

    public int getTamanoml() {
        return tamanoml;
    }

    public void setTamanoml(int tamanoml) {
        this.tamanoml = tamanoml;
    }
    
//To String

    @Override
    public String toString() {
        return super.toString() + "/" + tamanoml;
    }
    
    
}
