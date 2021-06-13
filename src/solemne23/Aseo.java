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
public class Aseo extends Producto {

//Atributos    
    String aroma;
    
//Constructores

    public Aseo(String categoria, String codigo, String descripcion, int precio,String aroma) {
        super(categoria, codigo, descripcion, precio);
        this.aroma = aroma;
    }

//Métodos

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

//To String

    @Override
    public String toString() {
        return super.toString() + "/" + aroma;
    }

}    
